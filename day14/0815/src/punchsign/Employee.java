package punchsign;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Employee {
     private String name;
     private  Integer times;
     private ArrayList<Date> dates = new ArrayList<>();

    public Employee(String name, Integer times) {
        this.name = name;
        this.times = times;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public ArrayList<Date> getDates() {
        return dates;
    }

    public void setDates(ArrayList<Date> dates) {
        this.dates = dates;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        StringBuffer strBF = new StringBuffer();
        for (Date date222:
             dates) {
           String str = sdf.format(date222) + "\t";
           strBF.append(str+"....");
        }

        return "姓名:" + name + '\t' +
                "打卡次数:" + times +'\n'+
                "打卡时间：\n" + strBF ;
    }
}
