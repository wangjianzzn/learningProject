package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class ReadFilePack {
    public static void main(String[] args) throws IOException {
        FileReader fileReader=null;
        try {
           fileReader = new FileReader("/Users/charlie/Desktop/test/a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String str="";
        while ((str=bufferedReader.readLine())!=null){
            String[] strings = str.split(",");
            for (int i = 0; i < strings.length; i++) {
                String[] keyValue = strings[i].split(":");


            }

        }
    }
}
