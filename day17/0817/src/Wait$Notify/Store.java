package Wait$Notify;

public class Store extends Thread {
    Baozi bz;
    int count=0;


    public Store(String name,Baozi bz) {
        super(name);
        this.bz = bz;
    }

    //   做包子进程
    @Override
    public void run() {

        while (true){
           synchronized (bz){
               if(bz.flag){
                   try {
                       bz.wait();
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }else {
//            做包子
                   System.out.println("---包子店开始做包子");
                   if(count%2 ==0){
                       bz.pier = "冰冰皮";
                       bz.xian = "红豆";
                   }else {
                       bz.pier = "猪猪皮";
                       bz.xian = "猪肉";
                   }
                   bz.flag = true;
                   count++;
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println("---"+Thread.currentThread().getName()+":包子做好了，是"+bz.pier+bz.xian+"馅的");
                   try {
                       Thread.sleep(1000);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   bz.notify();
               }
           }
        }
    }
}
