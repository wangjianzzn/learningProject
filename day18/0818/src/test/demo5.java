package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class demo5 {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/charlie/Desktop/test/aaa.txt");
        char[] chars = new char[4];
        FileReader fileReader = new FileReader(file);
        int length = 0;
        while ((length=fileReader.read(chars))!=-1){
            System.out.print(new String(chars,0,length));
        }



    }
}
