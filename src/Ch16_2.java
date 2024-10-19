//HashSet
/*
      添加元素 : add()
      判斷元素是否存在 : contains()

 */

import java.util.HashSet;

public class Ch16_2 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("Toronto");
        hs.add("Taipei");
        hs.add("Tokyo");
        hs.add("Toronto");
        hs.add("Chiang");
        System.out.println(hs);
        System.out.println(hs.contains("Tokyo"));
    }
}
