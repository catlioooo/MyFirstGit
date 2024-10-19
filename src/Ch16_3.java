//LinkedHashSet

import java.util.LinkedHashSet;

public class Ch16_3 {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();

        lhs.add("Toronto");
        lhs.add("Taipei");
        lhs.add("Tokyo");
        System.out.println(lhs);
    }
}
/*
HashSet : 內容順序與建立時順序是不同
LinkedHashSet : 內容順序與建立時順序是相同
 */
