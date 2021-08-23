import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class PunchSign {
    HashMap<String, Student> hsmap = new HashMap<>();

    public  PunchSign() {
        Student stu1 = new Student("张三", 0);
        Student stu2 = new Student("李四", 0);
        Student stu3 = new Student("王五", 0);
        Student stu4 = new Student("马六", 0);
        hsmap.put("1",stu1);
        hsmap.put("2",stu2);
        hsmap.put("3",stu3);
        hsmap.put("4",stu4);
    }
    public void punchSign(){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入工号进行打开（查询请输入s，推出输入q）");
        String key = sc.next();
        if (key.equals("s")){
            for (String str: hsmap.keySet()) {
                System.out.println(hsmap.get(str));
            }
        }else if (key.equals("q")){
            System.exit(0);
        }else {
            hsmap.get(key).setCounts(hsmap.get(key).getCounts()+1);
            hsmap.get(key).getTimes().add(new Date());
            System.out.println(hsmap.get(key).getName()+":打卡成功!");

        }
    }


}
