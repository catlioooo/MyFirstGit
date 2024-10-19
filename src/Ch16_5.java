import java.util.HashMap;
//HashMap
/*
     添加元素 : put()
     訪問元素 : get()
     移除特定元素 : remove()
     清除元素 : clear()
     計算大小 : size()
 */

public class Ch16_5 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(1, "Toronto");
        hm.put(2, "Taipei");
        hm.put(3, "Tokyo");
        System.out.println(hm);

        System.out.println(hm.get(2));

        hm.remove(3);
        System.out.println(hm);

        hm.clear();
        System.out.println(hm);

        System.out.println(hm.size());
    }
}

/*
         HashMap     HashSet
         (K,V)         (V)
         put()         add()
          快            慢
       成績、電話        資料
 */
