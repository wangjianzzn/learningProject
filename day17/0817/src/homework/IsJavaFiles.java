package homework;

import java.io.File;
import java.util.ArrayList;

public class IsJavaFiles {
    public static void main(String[] args) {
        File directory = new File("/Users/charlie/Desktop/test/");
//       获取到目录下所有的文件（文件夹）
        File[] files = directory.listFiles();
//       创建一个容器，存储java文件的文件名
        ArrayList<String> strings = new ArrayList<>();
//       若file 数组不为空，即该目录下不是空的
        if (files != null) {
//            循环file数组中所有的ile对象
            for (File fil : files) {
//                判断该对象是否是文件，且文件名是否以".java"结尾
                if (fil.isFile() && fil.getName().endsWith(".java")) {
//                    如果是，将名字添加到strings容器中
                    strings.add(fil.getName());
                }
            }
            if (!strings.isEmpty()) {
                System.out.println("路径：" + directory.getAbsolutePath() + "下存在的java文件为：");
                for (String str : strings) {
                    System.out.print(str + '\t');
                }
            } else System.out.println("该路径目录下无java文件");

        } else {
            System.out.println("该路径为空目录，无任何文件");
        }
    }
}
