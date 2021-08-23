package pmtest;

import java.io.*;
import java.util.Scanner;

public class Testwrite$read {
    Scanner sc =new Scanner(System.in);
    StringBuffer sb = new StringBuffer();
    FileWriter fileWriter = null;
    FileReader fileReader =null;
    String DZ = "/Users/charlie/Desktop/test/sb.txt";

    public void add(){
        System.out.println("输入添加的姓名");
        sb.append(sc.next());
        System.out.println("添加成功");
    }

    public void search(){
        System.out.println("查询姓名？");
        if (sb.toString().contains(sc.next())){
            System.out.println("存在");
        }else {
            System.out.println("不存在！");
        }
    }

    public void show(){
        System.out.println(sb.toString());
    }

    public void caidan() {
        int len = 0;
        char[] chars = new char[1024];
        try {
            fileReader = new FileReader(DZ);
            while ((len = fileReader.read(chars)) != -1) {
                sb.append(chars, 0, len);
            }
        } catch (FileNotFoundException e) {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            System.out.println("1.添加 2.查询 3.显示 4.退出");
            switch (sc.nextInt()) {
                case 1:
                    add();
                    break;
                case 2:
                    search();
                    break;
                case 3:
                    show();
                    break;
                case 4:
                    try {
                        fileWriter=new FileWriter(DZ);
                        fileWriter.write(sb.toString());
                        fileWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    System.exit(0);
                default:
                    System.out.println("输入有误！");
                    break;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Testwrite$read twr = new Testwrite$read();

          twr.caidan();
    }
}
