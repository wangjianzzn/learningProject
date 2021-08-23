package exercise;

import java.io.*;

public class FileCopy {


    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
             fileReader= new FileReader("/Users/charlie/Desktop/test/aaa.txt");
             fileWriter = new FileWriter("/Users/charlie/Desktop/test/copy.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        char[] chars = new char[1024];
        int len = 0;
        if (fileWriter != null) {
        while ((len=fileReader.read(chars))!=-1){
                fileWriter.write(chars,0,len);

        }

            fileWriter.flush();
            fileWriter.close();
        }



    }
}
