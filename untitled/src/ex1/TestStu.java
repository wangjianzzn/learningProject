package ex1;

public class TestStu {
    public static void main(String[] args) {

       /* Student stu1 = new Student("001","张三",'男',18,78);
        Student stu2 = new Student("002","李四",'男',28,66);
        Student stu3 = new Student("003","王五",'男',22,88);
        Student stu4 = new Student("004","马六",'女',20,74);
        Student stu5 = new Student("004","马六",'女',20,74);*/
    double height=50;
     int count=0;

     while (height>32){

         height = (height*7)/8;
         if(height>32){
             count +=2;
         }
         System.out.println("高度："+height);

     }
        System.out.println(count+1);

    }

}
