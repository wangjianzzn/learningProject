package wait$notify$again;

public class Shop extends Thread {
    LunchBox box;


    public Shop(String name, LunchBox box) {
        super(name);
        this.box = box;
    }

    @Override
    public void run() {
        int count = 0;
        while (true) {
            synchronized (box) {

                if (box.isFlag()) {
                    try {
                        box.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("------" + Thread.currentThread().getName() + "开始做包子");
                    if (count % 2 == 0) {
                        box.setBun("老面");
                        box.setStuffing("豆沙");
                    } else {
                        box.setBun("细面");
                        box.setStuffing("猪肉");
                    }
                    System.out.println("------包子做好了");
                    count++;
                    box.setFlag(true);
                    box.notify();
                }
            }
        }
    }
}
