package exercise;
import java.util.*;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StuManagement {
   public static ArrayList<Student> arrs = new ArrayList<>();
//    录入学生信息
    public void add(){
        Scanner sc = new Scanner(System.in);
        Student stu = new Student();
        System.out.println("输入需要录入学生的id");
        stu.setId(sc.nextInt());
        System.out.println("输入需要录入学生的姓名");
        stu.setName(sc.next());
        System.out.println("输入需要录入学生的年龄");
        stu.setAge(sc.nextInt());
        System.out.println("输入需要录入学生的班级");
        stu.setClasses(sc.next());
        System.out.println("输入需要录入学生的成绩");
        stu.setSource(sc.nextInt());
        arrs.add(stu);
        System.out.println("添加成功");
    }

//    查询学生信息

    public void searchByName(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入需要查询的学生姓名");
       String name1= scanner.next();
        for (int i = 0; i < arrs.size(); i++) {
            if (arrs.get(i).getName().equals(name1)) {
                System.out.println(arrs.get(i));
                return;
            }
        }
        System.out.println("查无此人");
    }

//    修改学生信息
    public  void modifyData(){
        System.out.println("请输入需要修改的学生姓名");
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        for (int i = 0; i < arrs.size(); i++) {
            if (arrs.get(i).getName().equals(name1)) {
                System.out.println("输入修改的成绩：");
                arrs.get(i).setSource(scanner.nextInt());
                return;
            }
        }
        System.out.println("查无此人");
    }

//    显示所有学生的信息
    public void displayAll(){
        for (Student stu:arrs)System.out.println(stu);
    }

//    按班级分组，查询每个班级的学生信息，以成绩高低进行显示
    public void searchByClasses(){
        System.out.println("请输入你需要查询的班级：");
        Scanner scanner = new Scanner(System.in);
        String class1 = scanner.next();
        ArrayList<Student> tempArrs = new ArrayList<>();
        for (int i = 0; i < arrs.size(); i++) {
            if (arrs.get(i).getClasses().equals(class1)){
                tempArrs.add(arrs.get(i));
            }
        }
        tempArrs.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
//        tempArrs.sort((o1, o2) -> o2.getSource() - o1.getSource());
        System.out.println(tempArrs);

    }

//    计算班级平均分，且根据平均分给班级排序
    public void sortByAvgScore(){
        Integer sum1 = 0;
        Integer sum2 = 0;
        Integer sum3 = 0;
        Integer count1=0;
        Integer count2=0;
        Integer count3=0;

//        arrs.stream().collect(Collectors.groupingBy(Student::getClasses)).
        for (Student stu : arrs) {
            if ("一班".equals(stu.getClasses())) {
                sum1 += stu.getSource();
                count1++;
            }else if ("二班".equals(stu.getClasses())){
                sum2 += stu.getSource();
                count2++;
            }else if ("三班".equals(stu.getClasses())){
                sum3 += stu.getSource();
                count3++;
            }
        }
        ArrayList<ClassesAvg> classesAvgs = new ArrayList<>();
        ClassesAvg c1 = new ClassesAvg("一班",sum1/count1);
        ClassesAvg c2 = new ClassesAvg("二班",sum2/count2);
        ClassesAvg c3 = new ClassesAvg("三班",sum3/count3);
        Collections.addAll(classesAvgs,c1,c2,c3);
//        Collections.sort(classesAvgs, (o1,o2)->o2.getAvgScore()-o1.getAvgScore());




        classesAvgs.sort(Comparator.comparingInt(ClassesAvg::getAvgScore));




        Collections.sort(classesAvgs, new Comparator<ClassesAvg>() {
            @Override
            public int compare(ClassesAvg o1, ClassesAvg o2) {
                return o1.getAvgScore()-o2.getAvgScore();
            }
        }
        );


        Comparator.co

        System.out.println(classesAvgs);
    }












    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StuManagement stuM = new StuManagement();
        Student s1 = new Student(22,"ww", 23, "一班", 93);
        Student s2 = new Student(44,"qq", 23, "二班", 65);
        Student s3 = new Student(32,"ee", 23, "一班", 89);
        Student s4 = new Student(12,"rr", 23, "三班", 55);
        Student s5 = new Student(52,"tt", 23, "一班", 46);
        Student s6 = new Student(22,"yy", 23, "二班", 34);
        Student s7 = new Student(222,"uu", 23, "三班", 98);
        Collections.addAll(arrs,s1,s2,s3,s4,s5,s6,s7);


        while (true){
            int i = scanner.nextInt();
            if (i==1){
               stuM.add();
                System.out.println("================");
            }else if (i==2){
                stuM.searchByName();
                System.out.println("================");
            }else if (i==3){
                stuM.modifyData();
                System.out.println("================");
            }else if (i==4){
                stuM.displayAll();
                System.out.println("================");
            }else if (i==5 ){
                stuM.searchByClasses();
            }else if (i==6){
                stuM.sortByAvgScore();
            }
        }
    }
}
