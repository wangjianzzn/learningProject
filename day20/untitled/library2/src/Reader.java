/*
*
* 读者类
* 1。读者姓名
* 2. 读者电话
* 3. 余额
* 4. 借的书
* */

import java.util.ArrayList;

public class Reader {
    private Integer id;
    private String readerName;
    private String tel;
    private int balance;
//    private ArrayList<Book> borBooks = new ArrayList<>();

    public Reader(String readerName, String tel) {
        this.readerName = readerName;
        this.tel = tel;
    }

    public String getReaderName() {
        return readerName;
    }

    public void setReaderName(String readerName) {
        this.readerName = readerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

/*    public ArrayList<Book> getBorBooks() {
        return borBooks;
    }

    public void setBorBooks(Book book) {
        this.borBooks.add(book);
    }*/
}
