import java.io.*;
import java.nio.file.Files;
import java.util.*;

//图书管理工具类
public class LibraryUtil {
//    定义一个扫描器
    Scanner sc = new Scanner(System.in);
//    创建一个集合，存放数据
    ArrayList<Book> books = new ArrayList<>();
//    定义一个地址，存储持久化文件
    final String DZ = "/Users/charlie/Desktop/test/books.txt";
//    录入书籍
    public void add(){
        System.out.println("请输入录入的书籍名");
        String name = sc.next();
        System.out.println("输入作者：");
        String author = sc.next();
        System.out.println("输入简介");
        String intro = sc.next();
        Book book = new Book(name,author,intro);
        books.add(book);
        System.out.println("添加成功");
    }

//    下架书籍
    public void del(){
        System.out.println("请输入需要删除的书名");
        String name = sc.next();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getName().equals(name)){
                books.remove(i);
                System.out.println("下架成功！");
                return;
            }
        }
        System.out.println("没有这本书");
    }

//    更新书籍
    public void update(){
        System.out.println("请输入需要更新的书籍名称");
        String name = sc.next();
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(book.getName().equals(name)){
                System.out.println("您需要修改的书籍如下:");
                System.out.println(book);
                System.out.println("修改什么？1. 书名  2. 作者  3. 简介");
                switch (sc.nextInt()){
                    case 1:
                        System.out.println("输入修改的书名：");
                        book.setName(sc.next());
                        System.out.println("书名修改成功！");
                        break;
                    case 2:
                        System.out.println("输入修改的作者名：");
                        book.setAuthor(sc.next());
                        System.out.println("作者修改成功！");
                        break;
                    case 3:
                        System.out.println("输入修改的简介：");
                        book.setIntro(sc.next());
                        System.out.println("简介修改成功！");
                        break;
                    default:
                        System.out.println("输入有误！");
                        break;
                }
                return;
            }
        }
        System.out.println("没有这本书");
    }

//    查询书籍
    public void getByName(){
        System.out.println("请输入需要查询的书名");
        String name = sc.next();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getName().equals(name)){
                System.out.println("查询书籍信息如下：");
                System.out.println(books.get(i));
                return;
            }
        }
        System.out.println("没有这本书");
    }

//    查询所有未借出地书籍
    public void showHaveBooks(){
     int count = 0;
//        循环所有书籍，根据checkedOut判断是否借出
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
//           如果没有借出，打印输出
            if(!book.isBorrowed()){
                System.out.println(book);
                count++;
            }
        }

        if(count==0){
            System.out.println("所有书籍都被借出!");
        }
    }

//    借出书籍
    public void borrow(){
        System.out.println("请输入你需要借的书");
        String name = sc.next();
//        循环遍历，根据书名查找书，如果checkedOut为false，则询问是否借出
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(book.getName().equals(name) && !book.isBorrowed()){
                System.out.println("查询到该书，是否借出？y/n");
                switch (sc.next()){
                    case "y":
                        book.setBorrowed(true);
                        book.setJieshu(new Date());
                        System.out.println("借书成功！");
                        break;
                    case "n":
                        System.out.println("退回菜单");
                        break;
                    default:
                        System.out.println("输入有误，退回菜单！");
                }
            }
        }
    }

//    查询已借出的所有书籍，并按借出时间排序
    public void showBorrowed(){
//        创建一个容器，存储已借出书籍
        ArrayList<Book> borrowedBooks = new ArrayList<>();
//        循环容器，根据borrowed判断，是否借出
        for (int i = 0; i < this.books.size(); i++) {
            Book book = this.books.get(i);
            if (book.isBorrowed()){
                borrowedBooks.add(book);
            }
        }
        if (borrowedBooks.size()!=0){
            borrowedBooks.sort(Comparator.comparingLong(o -> o.getJieshu().getTime()));
            System.out.println("已借出书籍:");
            for (Book borrowedBook : borrowedBooks) {
                System.out.println(borrowedBook);
            }
        }else {
            System.out.println("没有借出的书籍");
        }
    }

//    归还书籍
    public void returnBook(){
        System.out.println("输入你要归还的书籍");
        String name = sc.next();
//        循环查找
        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);
            if(book.getName().equals(name)){
                if (book.isBorrowed()){
                    book.setBorrowed(false);
                    book.setHuanshu(new Date());
                    int money = (int) ((book.getHuanshu().getTime()-book.getJieshu().getTime())/1000);
                    System.out.println("还书成功！需要付费"+money+"元,付多少");
                    int pay = sc.nextInt();
                    System.out.println("付款成功！");
                }
                return;
            }
        }
        System.out.println("这本书不是我们这的，886！");
    }

    public void menu(){
//        创建文件字节读取流
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(DZ);
            ois = new ObjectInputStream(fis);
            books= (ArrayList<Book>) ois.readObject();
        } catch (FileNotFoundException e) {
            try {
                new File(DZ).createNewFile();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
//            释放内存
            if(fis!=null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ois!=null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        while (true){
            System.out.println("1.录入书籍 2.下架书籍 3.更新书籍 4.查询书籍 5.查询所有未借出书籍 6.借出书籍 7.查询已借出所有书籍 8.还书 9.退出");
            switch (sc.nextInt()){
                case 1:
                    add();
                    break;
                case 2:
                    del();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    getByName();
                    break;
                case 5:
                    showHaveBooks();
                    break;
                case 6:
                    borrow();
                    break;
                case 7:
                    showBorrowed();
                    break;
                case 8:
                    returnBook();
                    break;
                case 9:
                    FileOutputStream fos=null;
                    ObjectOutputStream oos=null;
                    try {
                        fos = new FileOutputStream(DZ);
                        oos = new ObjectOutputStream(fos);
                        oos.writeObject(books);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }finally {
                        if (fos!=null){
                            try {
                                fos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                        if (oos!=null){
                            try {
                                oos.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    }

                    System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
        new LibraryUtil().menu();
    }
}
