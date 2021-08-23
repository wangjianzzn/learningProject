package wait$notify$again;

public class Person extends Thread {
    LunchBox box;

    public Person(String name, LunchBox box) {
        super(name);
        this.box = box;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (box) {
                if (box.isFlag()) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "开始吃" + box.getBun() + box.getStuffing() + "包子");
                    box.setFlag(false);
                    box.notify();
                } else {
                    try {
                        box.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
