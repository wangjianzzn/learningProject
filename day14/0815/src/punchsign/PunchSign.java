package punchsign;

import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

public class PunchSign {
    HashMap<String, Employee> hm = new HashMap<>();
    public PunchSign(){
        Employee emp1 = new Employee("张三", 0);
        Employee emp2 = new Employee("李四", 0);
        Employee emp3 = new Employee("王五", 0);
        hm.put("111",emp1);
        hm.put("222",emp2);
        hm.put("333",emp3);
    }

    public void punchSign(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入工号打卡（查询输入S，推出输入Q）");
        String key = scanner.next();
        if(key.equals("S")){
            for (String ss :
                    hm.keySet()) {
                System.out.println(hm.get(ss));
            }
        }else if(key.equals("Q")){
            System.exit(0);
        }else {
            hm.get(key).setTimes(hm.get(key).getTimes()+1);
            hm.get(key).getDates().add(new Date());
        }
    }

    public static void main(String[] args) {
        PunchSign ps = new PunchSign();
        while (true){
            ps.punchSign();
        }
    }
}
