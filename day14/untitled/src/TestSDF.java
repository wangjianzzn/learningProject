import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSDF {
    public static void main(String[] args) throws ParseException {
        Date nowDate = new Date();
        SimpleDateFormat sDF = new SimpleDateFormat("yyyy年MM月DD日  HH:mm:ss");
//        System.out.println(nowDate);
//
//        System.out.println(sDF.format(nowDate));
        Date date = sDF             .parse("2018年12月12日  14:24:32");
        System.out.println(date);



    }
}
