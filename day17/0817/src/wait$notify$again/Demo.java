package wait$notify$again;

public class Demo {
    public static void main(String[] args) {
        LunchBox lunchBox = new LunchBox();
        Person p = new Person("小明", lunchBox);
        Shop s = new Shop("包子铺", lunchBox);
        p.start();
        s.start();

    }
}
