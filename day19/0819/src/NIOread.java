import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Channel;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOread {
    public static void main(String[] args) throws IOException {
//      创建文件字节读取流
        FileInputStream fileInputStream = new FileInputStream("/Users/charlie/Desktop/test/aaa.txt");
//        创建通道
        FileChannel channel = fileInputStream.getChannel();
//        创建缓冲区
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
//        数据读到缓冲区
       int readNum =  channel.read(byteBuffer);

        System.out.println(readNum);
        System.out.println(new String(byteBuffer.array(),0,readNum));

//        Paths 替代File
//        使用Paths创建一个指定路径的Path对象
       Path path =  Paths.get("/Users/charlie/Desktop/test/aaa.txt");
//        Files.createDirectories(path);创建多级文件夹，如果文件存在会抛异常
//        Files.createFile(path); 创建文件，如果文件存在，会抛异常
//        Files.delete(path); 删除文件，或者空文件
//        Files.deleteIfExists()
//          Files.move();  移动文件 、重命名
//        Files.copy()



    }
}
