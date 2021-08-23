package ex1;

public class Student {
    private String sNo;
    private String sName;
    private char sSex;
    private int sAge;
    private  int sJava;

    public Student(String sNo, String sName, char sSex, int sAge, int sJava) {
        this.sNo = sNo;
        this.sName = sName;
        this.sSex = sSex;
        this.sAge = sAge;
        this.sJava = sJava;
    }

    public Student() {
    }

    public String getsNo() {
        return sNo;
    }

    public void setsNo(String sNo) {
        this.sNo = sNo;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public char getsSex() {
        return sSex;
    }



    public int getsAge() {
        return sAge;
    }

    public void setsAge(int sAge) {
        this.sAge = sAge;
    }

    public int getsJava() {
        return sJava;
    }

    public void setsJava(int sJava) {
        this.sJava = sJava;
    }
}
