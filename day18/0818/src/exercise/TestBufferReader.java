package exercise;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class TestBufferReader {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader("/Users/charlie/Desktop/test/aaa.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

    }
}
