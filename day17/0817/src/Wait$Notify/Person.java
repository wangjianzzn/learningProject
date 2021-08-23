package Wait$Notify;

public class Person extends Thread {
    Baozi bz;

    public Person(String name,Baozi bz) {
        super(name);
        this.bz = bz;

    }


    //    吃包子线程
    @Override
    public void run() {
      while (true){
         synchronized (bz){
             if(!bz.flag){
                 try {
                    bz.wait();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }else {
                 System.out.println(Thread.currentThread().getName()+ ":开始吃包子，"+bz.pier+bz.xian+"的包子");
                 bz.flag = false;
                 bz.notify();
             }
         }
      }
    }
}
