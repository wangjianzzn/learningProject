import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class LibraryUtil {

//    1.定义一个扫描器
    Scanner sc = new Scanner(System.in);
//    2.创建一个集合存储书籍
    ArrayList<Book> books = new ArrayList<>();
//    3.定义一个地址，持久化存储数据
    String dz = "/Users/charlie/Desktop/test";
//    4.定义一个集合存储会员信息
    ArrayList<Reader> readers = new ArrayList<>();
//    5.定义一个集合存储已借书籍
    ArrayList<Book> borBooks = new ArrayList<>();


//    添加书籍
    public void add(){
        System.out.println("请输入你要添加的书籍");
        String bookName = sc.next();
        for (Book book : books) {
//            如果库存中已经存在这本书，直接弹出本次添加数量
            if(book.getBookName().equals(bookName)){
                System.out.println("查询到该书：");
                System.out.println(book);
                System.out.println("请输入要添加的数量:");
                book.setNums(book.getNums()+sc.nextInt());
                System.out.println("添加成功！");
                return;
            }
        }
//        如果仓库没有这本书，让用户继续输入信息，添加书籍
        System.out.println("请输入书籍的作者");
        String author = sc.next();
        System.out.println("请入简介：");
        String intro = sc.next();
        System.out.println("请输入添加数量：");
        int nums = sc.nextInt();
//       将新书添加到集合中
        books.add(new Book(bookName,author,intro,nums));
        System.out.println("添加成功！");

    }

//    下架书籍
    public void del(){
        System.out.println("请输入需要删除的书名");
        String name = sc.next();
        for (int i = 0; i < books.size(); i++) {
            if(books.get(i).getBookName().equals(name)){
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
            if(book.getBookName().equals(name)){
                System.out.println("您需要修改的书籍如下:");
                System.out.println(book);
                System.out.println("修改什么？1. 书名  2. 作者  3. 简介 ");
                switch (sc.nextInt()){
                    case 1:
                        System.out.println("输入修改的书名：");
                        book.setBookName(sc.next());
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
    for (Book book : books) {
        if(book.getBookName().equals(name)){
            System.out.println("查询书籍信息如下：");
            System.out.println(book);
            return;
        }
    }
    System.out.println("没有这本书");
}

//    查询所有未借出书籍信息
    public void showHaveBooks(){
    boolean haveBooks=false;
//        循环所有书籍，根据nums判断是否还有书
    for (Book book : books) {
        if(book.getNums()!=0){
            System.out.println(book);
            haveBooks = true;
        }
    }
    if(!haveBooks){
        System.out.println("库存没书了，全被借走了！");
    }
}

//    借出书籍
    public void borrow(){
        System.out.println("请输入你要借的书：");
        String bookName = sc.next();
        for (Book book : books) {
//            判断库存中是否有这本书？
            if(book.getBookName().equals(bookName)&&book.getNums()!=0){
                System.out.println("查询到这边本书:");
                System.out.println(book);
                System.out.println("是否借出？（y/n）");

                if (sc.next().equals("y")){
//                    录入借书人信息
                    System.out.println("请输入借书人会员号：");
                    int id = sc.nextInt();
                    for (Reader reader : readers) {
                        if(reader.getId()==id){
//                            已借书籍容器中存入借的书籍
                            borBooks.add(new Book(book.getBookName(),book.getAuthor(),book.getIntro(),new Date(),reader));
//                            库存数量-1
                            book.setNums(book.getNums()-1);
                            System.out.println("借书成功！");
                            return;
                        }
                    }

                }
            }
        }
    }

//   查询所有已借出书籍
    public void showAllBor(){
//        借出书籍按借出时间排序
        borBooks.sort(Comparator.comparingLong(o -> o.getBorTime().getTime()));
        for (Book borBook : borBooks) {
            System.out.println(borBook);
        }
    }

//    归还书籍
    public void returnBook(){
        System.out.println("要还什么书？？");
        String bookName = sc.next();
        for (Book borBook : borBooks) {
            if(bookName.equals(borBook.getBookName())){
                int balance = borBook.getBorReader().getBalance();
                int cost = (int) ((new Date().getTime()- borBook.getBorTime().getTime())/1000);
                System.out.println("您需要付费"+cost+"元，卡上余额："+balance);
                if(balance>= cost){
                    borBook.getBorReader().setBalance(balance-cost);
                }else {
                    borBook.getBorReader().setBalance(0);
                    System.out.println("卡上余额不足，您还需要支付"+(cost-balance)+"元,请支付。。。");
                    sc.nextInt();
                }
                borBooks.remove(borBook);
                for (Book book : books) {
                    if (bookName.equals(book.getBookName())) {
                        book.setNums(book.getNums()+1);
                    }
                }
                System.out.println("还书成功！");
                System.out.println("还书+扣费成功，卡上余额"+borBook.getBorReader().getBalance());
                return;

            }
        }
    }

//   系统结束前读取文件的方法
    public void writeFile(){
        FileOutputStream fos=null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(dz);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(borBooks);
            oos.writeObject(books);
            oos.writeObject(readers);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fos!=null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(oos!=null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

//    系统开始前需要读取文件的方法
    public void readFiles(){
        FileInputStream fis;
        ObjectInputStream ois;
        try {
            fis = new FileInputStream(dz);
            ois = new ObjectInputStream(fis);
            books= (ArrayList<Book>) ois.readObject();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }



}


