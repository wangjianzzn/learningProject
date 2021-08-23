import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
/*
*
* 书本类
* 1.书名
* 2.作者
* 3.简介
* */

public class Book implements Serializable {

    private String name;
    private String author;
    private String intro;
    private  Integer id;
//    false :未借出  true：已借出
    private boolean borrowed=false;

    private Date huanshu;
    private Date jieshu;

    public Date getHuanshu() {
        return huanshu;
    }

    public void setHuanshu(Date huanshu) {
        this.huanshu = huanshu;
    }

    public Date getJieshu() {
        return jieshu;
    }

    public void setJieshu(Date jieshu) {
        this.jieshu = jieshu;
    }

    public Book(String name, String author, String intro) {
        this.name = name;
        this.author = author;
        this.intro = intro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    //date需要格式化

    @Override
    public String toString( ) {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", intro='" + intro + '\'' +
                ", borrowed=" + borrowed +
                ", huanshu=" + huanshu +
                ", jieshu=" + jieshu +
                '}';
    }

}
