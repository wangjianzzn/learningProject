import java.io.Serializable;
import java.util.Date;

public class Book implements Serializable   {
    private String bookName; //书名
    private String writer; //作者
    private String intro; //简介
    private  String lender; //借书人
    private Date date; //结束时间
    private  Integer bookNum; //书籍数量
//  初始化1，书籍名、作者，简介，数量
    public Book(String bookName, String writer, String intro, String lender, Date date, Integer bookNum) {
        this.bookName = bookName;
        this.writer = writer;
        this.intro = intro;
        this.lender = lender;
        this.date = date;
        this.bookNum = bookNum;
    }
//    初始化2： 书籍名，作者，简介，借出人，借出时间

    public Book(String bookName, String writer, String intro, String lender, Date date) {
        this.bookName = bookName;
        this.writer = writer;
        this.intro = intro;
        this.lender = lender;
        this.date = date;
    }

    public Book(String bookName, String writer, String intro, Integer bookNum) {
        this.bookName = bookName;
        this.writer = writer;
        this.intro = intro;
        this.bookNum = bookNum;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String getLender() {
        return lender;
    }

    public void setLender(String lender) {
        this.lender = lender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getBookNum() {
        return bookNum;
    }

    public void setBookNum(Integer bookNum) {
        this.bookNum = bookNum;
    }

    @Override
    public String toString() {
        return "书籍信息{" +
                "书籍名称='" + bookName + '\'' +
                ", 作者='" + writer + '\'' +
                ", 简介='" + intro + '\'' +
                ", 库存数量=" + bookNum +
                '}';
    }
}
