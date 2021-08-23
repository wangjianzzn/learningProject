package Wait$Notify;

public class Test {

    public static void main(String[] args) {
        Baozi baozi = new Baozi();
        Store store = new Store("包子铺",baozi);
        Person person = new Person("猪猪",baozi);
        store.start();
        person.start();

    }
}
