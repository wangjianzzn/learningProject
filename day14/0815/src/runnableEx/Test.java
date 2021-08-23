package runnableEx;

public class Test {
    public static void main(String[] args) {
        SelfDefinedRunnable sDR = new SelfDefinedRunnable();
        Thread td = new Thread(sDR, "cc");
        td.start();
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+"---"+i);
        }

    }
}
