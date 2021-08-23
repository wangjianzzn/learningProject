package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Copy$Sort {
    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        FileWriter fw = null;
        try {
             fr = new FileReader("/Users/charlie/Desktop/test/aaa.txt");
             fw = new FileWriter("/Users/charlie/desktop/test/bbb.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fr);
//        获取到文件内容
        String str= bufferedReader.readLine();
        ArrayList<Integer> list = new ArrayList<>();
//        以","切割字符串，转型为int存入list
        for (String num : str.split(",")) list.add(Integer.parseInt(num));
//        排序
        list.sort((o1, o2) -> o1 - o2);
//        所有元素，通过"，"串成字符串，除最后一个
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < list.size()-1;i++) sb.append(list.get(i)+",");
//        写入新文件
        fw.write(sb.append(list.get(list.size()-1)).toString());

        fw.close();






    }
}
