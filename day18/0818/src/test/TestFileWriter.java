package test;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("/Users/charlie/Desktop/test/aaa.txt",true);
        writer.write("abccc");
        writer.write("kokok");
        writer.flush();
    }
}
