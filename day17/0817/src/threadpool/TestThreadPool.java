package threadpool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThreadPool {
    public static void main(String[] args) {
        /*ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            int temp = i;
            es.execute(() -> System.out.println(Thread.currentThread().getName()+"  --- i="+temp));
        }*/
        ExecutorService es2 = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 100; i++) {
            int temp = i;
            es2.execute(() -> System.out.println(Thread.currentThread().getName()+"  --- i="+temp));
        }


    }
}
