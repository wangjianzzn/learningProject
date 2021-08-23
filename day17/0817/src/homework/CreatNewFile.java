package homework;

import java.io.File;
import java.io.IOException;

public class CreatNewFile {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/charlie/Desktop/test/c/b/d/e/");
        System.out.println(file.mkdirs());
       new File(file.getAbsolutePath() + "/f.txt").createNewFile();


    }
}
