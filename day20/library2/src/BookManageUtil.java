import com.sun.org.apache.regexp.internal.RE;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class BookManageUtil {
//    扫描器
    Scanner sc = new Scanner(System.in);
//    创建一个存储未借出书籍的容器
    ArrayList<Book> books = new ArrayList<>();
//    创建一个存储已借出书籍的容器
    ArrayList<Book> lendBooks = new ArrayList<>();
//    定义两个地址，分别存储两个容器持久化地址
    final String aBooks = "/Users/charlie/Desktop/test/abooks.txt";
    final String alendBooks = "/Users/charlie/Desktop/test/alendBooks.txt";

//    添加书籍
    public void add(){
//        1.录入书籍信息
        System.out.println("请您输入书籍名称");
        String bookName = sc.next();
//       如果库存中已经存储了这本书，直接询问添加数量
        for (int i=0;i<books.size();i++) {
            Book book = books.get(i);
            if(book.getBookName().equals(bookName)){
                System.out.println("请输入需要添加书籍的数量");
                book.setBookNum(sc.nextInt());
                System.out.println("添加成功！");
                return;
            }
        }
//        如果库存中不存在这本书，继续录入信息
        System.out.println("请输入书籍作者：");
        String writer = sc.next();
        System.out.println("请输入书籍简介：");
        String intro  = sc.next();
        System.out.println("请输入书籍数量");
        int nums = sc.nextInt();
//        封装书籍对象
        Book book2 = new Book(bookName,writer,intro,nums);
//        存入未借出的书籍容器中
        books.add(book2);
        System.out.println("添加成功！");

    }

//    下架书籍
    public  void del(){
        System.out.println("请输入下架书籍的名称");
        String bookName = sc.next();
        for (Book book : books) {
            if(book.getBookNum().equals(bookName)){
                System.out.println("您要下架的书籍是：");
                System.out.println(book);
                System.out.println("确认删除？y/n");
                if(sc.next().equalsIgnoreCase("y")){
                    books.remove(book);
                    System.out.println("下架成功");
                    return;
                }else {
                System.out.println("那你考虑清楚在下架哦~");
                return;
                }
            }
        }
        System.out.println("没有这本书");
    }

//    修改书籍
    public void update(){
        System.out.println("请输入您要更新的书籍名称：");
        String bookName = sc.next();
//        循环判断是否存在要修改的书籍
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(book.getBookName().equals(bookName)){
//                存在需要修改的书籍
                System.out.println("您要修改的书籍信息是："+book);
                System.out.println("请您输入新书名：");
                book.setBookName(sc.next());
                System.out.println("请您输入新作者");
                book.setWriter(sc.next());
                System.out.println("请您输入新简介");
                book.setIntro(sc.next());
                System.out.println("请您输入新数量：");
                book.setBookNum(sc.nextInt());
                System.out.println("更新成功！");
                return;
            }
        }
        System.out.println("未找到书籍！");
    }

//    查询书籍
    public void selectByName(){
        System.out.println("请您输入需要查询的书籍名称：");
        String bookName = sc.next();
//        循环判断
        for (Book book : books) {
            if(book.getBookName().equals(bookName)){
                System.out.println("您查询的书籍信息如下：");
                System.out.println(book);
                return;
            }
        }
        System.out.println("未查到书籍!");
    }

//    显示所有未借出的书籍
    public void selectAll(){
        if(books.size()==0){
            System.out.println("还没有录入任何书籍哦~");
        }else {
            System.out.println("书籍如下：");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

//    借出书籍
    public void lendBook(){
        System.out.println("请输入您要借的书籍：");
        String bookName = sc.next();
//        循环判断是否存在借出书籍
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(bookName.equals(books.get(i).getBookName())){
                System.out.println("您要借的书籍信息如下：");
                System.out.println(book);
                System.out.println("确定是否借出（y/n）？");
                if(sc.next().equalsIgnoreCase("y")){
                    System.out.println("请您输入借书人的名字");
                    String lender = sc.next();
//                    开始借书
//                    判断是不是最后一本书
                    if(book.getBookNum()==1){
//                        如果是最后一本，需要把当前书籍对象从未借出书籍容器中移除，然后添加到借出书籍容器中
                        book.setLender(lender);
                        book.setDate(new Date());
                        lendBooks.add(book);
                        books.remove(i);
                        System.out.println("您已借出成功，记得还书哦");
                        return;
                    }else {
//                        如果不是最后一本，只需要把num-1，不用移除对象
                        book.setBookNum(book.getBookNum()-1);
//                        创建一个借出书籍对象
                        Book lendBook = new Book(book.getBookName(), book.getWriter(), book.getIntro(),lender,new Date());
                        lendBooks.add(lendBook);
                        System.out.println("您已借出成功，记得还书哦");
                        return;


                    }
                }else {
                    System.out.println("那你在考虑考虑~");
                    return;
                }
            }
        }
        System.out.println("没有这本书！");
    }

//    查询所有借出书籍
    public void selectAllLendBooks(){
        if (lendBooks.size()==0){
            System.out.println("当前书籍全未被借出");
        }else {
            System.out.println("借出书籍信息如下");
//            根据借出时间排序
            lendBooks.sort(Comparator.comparingLong(o -> o.getDate().getTime()));
        }
        for (Book lendBook : lendBooks) {
            System.out.println("书名"+lendBook.getBookName());
            System.out.println("作者"+lendBook.getWriter());
            System.out.println("简介"+lendBook.getIntro());
            System.out.println("借书人"+lendBook.getLender());
            System.out.println("借书时间"+lendBook.getDate());
            System.out.println("-------------------------");
        }
    }

//    归还书籍
    public void backBook(){
        System.out.println("请输入您要归还的书籍名称：");
        String bookName = sc.next();
//        循环借出书籍容器中的判断书籍是否存在
        for (int i = 0; i < lendBooks.size(); i++) {
            Book book = lendBooks.get(i);
            if(book.getBookName().equals(bookName)){
                System.out.println("书名"+book.getBookName());
                System.out.println("作者"+book.getWriter());
                System.out.println("简介"+book.getIntro());
                System.out.println("借书人"+book.getLender());
                System.out.println("借书时间"+book.getDate());
                System.out.println("-------------------------");
                long time = new Date().getTime()-book.getDate().getTime();
                long miao = time/1000;
                System.out.println("您一共借出去"+miao+"秒，消费"+miao+"元");
                System.out.println("是否确定归还？y/n");
                if (sc.next().equalsIgnoreCase("y")){
//                    判断未借出书籍容器中是否存在这本书
//                    存在：数量+1
//                    不存在，把这边本书放进未借出容器，数量为1
//                    把借出书籍从借出容器中删除
                    boolean b = false;//假设未借出书籍容器不存在这本书
                    for (Book book1 : books) {
                        if(book1.getBookName().equals(bookName)){
                            b=true;
                            book1.setBookNum(book1.getBookNum()+1);
                            break;
                        }
                    }
                    if(!b){
//                        说明借出容器中并不窜在这本书
                        Book book1 = new Book(book.getBookName(),book.getWriter(),book.getIntro(),1);
                        books.add(book1);
                    }
                    lendBooks.remove(i);
                    System.out.println("归还成功！");
                    return;
                }else {
                    System.out.println("考虑清楚再还！");
                    return;
                }
            }
        }
        System.out.println("没有这本书");
    }

//    把集合对象持久化写入到本地
    public void write(){
        FileOutputStream booksfos = null;
        FileOutputStream lendfos = null;
        ObjectOutputStream booksOos = null;
        ObjectOutputStream lendOos = null;

        try {
            booksfos = new FileOutputStream(aBooks);
            lendfos = new FileOutputStream(alendBooks);
            booksOos = new ObjectOutputStream(booksfos);
            lendOos = new ObjectOutputStream(lendfos);
            booksOos.writeObject(books);
            lendOos.writeObject(lendBooks);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (booksOos!=null) {
                try {
                    booksOos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (lendOos!=null){
                try {
                    lendOos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    把指定文件中的数据读取并赋值到程序集合中
    public void read(){
        FileInputStream booksFis = null;
        FileInputStream lendFis = null;
        ObjectInputStream booksOis =null;
        ObjectInputStream lendOis = null;
        try {
            booksFis = new FileInputStream(aBooks);
            lendFis = new FileInputStream(alendBooks);
            booksOis = new ObjectInputStream(booksFis);
            lendOis = new ObjectInputStream(lendFis);

            books = (ArrayList<Book>) booksOis.readObject();
            lendBooks = (ArrayList<Book>) lendOis.readObject();
        } catch (FileNotFoundException e) {
            try {
                new File(aBooks).createNewFile();
                new File(alendBooks).createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

//    菜单
    public void menu(){
        read();
        System.out.println("==========欢迎进入图书管理系统================");
        while (true){
            System.out.println("1.录入书籍 2.下架书籍 3.更新书籍 4.查询书籍 5.查询所有未借出书籍 6.借出书籍 7.查询所有借出书籍 8.归还书籍 9.退出");
            switch (sc.nextInt()){
                case 1:
                    add();
                    break;
                case 2:
                    del();
                    break;
                case 3 :
                    update();
                    break;
                case 4:
                    selectByName();
                    break;
                case 5:
                    selectAll();
                    break;
                case 6:
                    lendBook();
                    break;
                case 7:
                    selectAllLendBooks();
                    break;
                case 8:
                    backBook();
                    break;
                case 9:
                    write();
                    System.out.println("欢迎下次使用！");
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入有误");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        new BookManageUtil().menu();
    }
}
