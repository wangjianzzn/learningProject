public class TestSleep {
    public static void main(String[] args){
        String[] str = {".",".",".",".",".",".",".",".",".",".",".",".","."};
        System.out.print("启动中");
        for (int i = 0; i < str.length; i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(str[i]);
        }
        System.out.println("启动成功！");
    }
}
