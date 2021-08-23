package test;

import java.io.*;

public class Demo2 {

    public  boolean copyFile(File file,File copyPath) throws IOException {
            FileWriter fw = new FileWriter(file);
            FileReader fr = new FileReader(copyPath);
            char[] chars = new char[5];
            fr.read(chars);
        System.out.println(new String(chars));



        return true;
    }

    public static void main(String[] args) {
//        new File()
    }
}
