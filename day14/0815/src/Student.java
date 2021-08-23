import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Student {
    private String name;
    private Integer counts;
    private ArrayList<Date> times = new ArrayList<>();

    public Student(String name, Integer counts) {
        this.name = name;
        this.counts = counts;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCounts() {
        return counts;
    }

    public void setCounts(Integer counts) {
        this.counts = counts;
    }

    public ArrayList<Date> getTimes() {
        return times;
    }

    public void setTimes(ArrayList<Date> times) {
        this.times = times;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        for (Date date : times) {
            String str = sdf.format(date);

        }
        return "姓名：'" + name + "\n" +
                "打卡次数:" + counts +
                "\n"+"打卡时间:" + times;
    }
}
