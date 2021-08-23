import java.util.HashMap;

public class LetterTest {
    public static void main(String[] args) {

        String str = "sdkofwkererjflkfjwopweripowefdsjfowepfw";
//        新建一个hashmap集合存储 出现的字母和出现的次数
        HashMap<Character, Integer> cimap = new HashMap<>();

//        遍历字符串
        for (int i = 0; i < str.length(); i++) {
//            如果容器中已经存在这个字母，那么根据字母获取到次数并修改+1
            if (cimap.containsKey(str.charAt(i))) {
                cimap.put(str.charAt(i), cimap.get(str.charAt(i)) + 1);
            } else {
//                如果没有，新增一对键值
                cimap.put(str.charAt(i), 1);
            }
        }
//        forEach方法遍历hashmap集合，并根据格式输出
        cimap.forEach((o1, o2) -> System.out.println(o1 + "---" + o2));
    }
}
