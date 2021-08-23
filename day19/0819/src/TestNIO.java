import java.nio.Buffer;
import java.nio.ByteBuffer;

public class TestNIO {
    public static void main(String[] args) {
        //    1.创建一个缓冲区，容量为1024
        ByteBuffer bb = ByteBuffer.allocate(1024);

//        获取当前缓冲区的位置
        System.out.println("当前位置："+bb.position());
        System.out.println("当前限制："+bb.limit());
//        存入数据
        bb.put("hello".getBytes());
        System.out.println("当前位置2："+bb.position());
        System.out.println("当前限制2："+bb.limit());

//        切换为读模式
//        容量：不变
//        位置：初始为0
//        限制：最大位置（变为以 前的位置）
        bb.flip();
        System.out.println("当前位置3："+bb.position());
        System.out.println("当前限制3："+bb.limit());

        byte[] bbs = new byte[bb.limit()];
        bb.get(bbs);
        System.out.println(new String(bbs));

    }


}
