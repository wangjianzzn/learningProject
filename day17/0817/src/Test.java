public class Test {

    public static void main(String[] args) {
        SelfRunnable self = new SelfRunnable();
        Thread t1 = new Thread(self,"窗口1");
        Thread t2 = new Thread(self,"窗口2");
        Thread t3 = new Thread(self,"窗口3");
        Thread t4 = new Thread(self,"窗口4");
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
