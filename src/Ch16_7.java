//Iterable 介面
/*
     next () : 指向下一個元素
     hasNext () : 跌代內還有元素，傳回true
     remove () : 刪除跌代返回的最後一個元素
 */


import java.util.ArrayList;
import java.util.Iterator;

public class Ch16_7 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>(1);
        al.add("Toronto");
        al.add("Taipei");
        al.add("Tokyo");
        al.add("Toronto");

        //跌代器
        Iterator<String> it = al.iterator();

        //輸出的第一個元素
        //System.out.println(it.next());

        //輸出集合中的所有元素
        while (it.hasNext()){
            String str = it.next();
            if(str == "Tokyo"){
                it.remove();
            }
        }
        System.out.println(it.next());
    }
}
