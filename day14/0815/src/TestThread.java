public class TestThread {
    public static void main(String[] args) {
        Shuai shuai = new Shuai();
        Chou chou = new Chou();
        shuai.start();
        chou.start();
    }
}
