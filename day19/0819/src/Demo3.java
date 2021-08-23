import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo3 {
    public static void main(String[] args) throws IOException {
        /*
         * 通道传输缓冲区数据
         *   使用支持通道类进行创建
         *
         * 1.文件字节写入流
         * */
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("/Users/charlie/Desktop/test/aaa.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//    2.获取通道
        FileChannel channel = fos.getChannel();
//    3. 创建缓冲区
        ByteBuffer bu = ByteBuffer.allocate(1024);
//    4. 向缓冲区中存入数据
        bu.put("hello".getBytes());
//    5.通过通道进行传输缓冲区的数据
        bu.flip();
        channel.write(bu);
        fos.close();

    }


}
