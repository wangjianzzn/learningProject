package ex.ex3;

public class Nanny implements Service {
    @Override
    public void wash() {
        System.out.println("阿姨扫地");
    }

    @Override
    public void maicai() {
        System.out.println("阿姨买菜");
    }

    @Override
    public void cook() {
        System.out.println("阿姨做饭");
    }

    @Override
    public void saodi() {
        System.out.println("阿姨扫地");
    }
}
