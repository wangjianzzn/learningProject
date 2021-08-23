public class SelfRunnable implements Runnable {
   private Integer tickets = 100;
   Object o = new Object();
    @Override
    public void run() {
       synchronized (o){
           while (tickets>0){
               try {
                   Thread.sleep(100);
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
               System.out.println(Thread.currentThread().getName()+"正在卖票："+tickets--);
           }
       }
    }
}
