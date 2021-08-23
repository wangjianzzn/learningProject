import java.io.Serializable;
import java.util.Date;
/*
* 图书类
* 1.书名
* 2.作者
* 3.简介
* 4.剩余数量
* 5.借出时间
* 6.借出人
* */
public class Book implements Serializable {
    private String bookName;
    private String author;
    private String intro;
    private Integer nums;
    private Date borTime;
    private Reader borReader;
    //    false :未借出  true：已借出
//    private boolean borrowed=false;


    public Book(String bookName, String author, String intro, Integer nums) {
        this.bookName = bookName;
        this.author = author;
        this.intro = intro;
        this.nums = nums;
    }

    public Book(String bookName, String author, String intro, Date borTime, Reader borReader) {
        this.bookName = bookName;
        this.author = author;
        this.intro = intro;
        this.borTime = borTime;
        this.borReader = borReader;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public Integer getNums() {
        return nums;
    }

    public void setNums(Integer nums) {
        this.nums = nums;
    }

    public Date getBorTime() {
        return borTime;
    }

    public void setBorTime(Date borTime) {
        this.borTime = borTime;
    }

    public Reader getBorReader() {
        return borReader;
    }

    public void setBorReader(Reader borReader) {
        this.borReader = borReader;
    }


}
