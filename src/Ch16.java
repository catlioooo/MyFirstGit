import java.util.ArrayList;

// Java Collection = Java 集合物件
// Generic 泛型   -> 讓程式碼變簡潔 -> 符號<T> T:Type
// E(Element) ,K(Key) ,N(Number) ,V(Value)


//*** ArrayList ***
/*
 添加元素 : add()
 合併元素 : addAll()
 計算大小 : size() (不是length)
 訪問元素 : get()
 修改元素 : set()
 移除元素 : remove()
 */

public class Ch16 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        //var al = new ArrayList<String>();
        al.add("Toronto");  //添加元素
        al.add("Taipei");
        al.add("Tokyo");
        al.add("Toronto");
        System.out.println(al);
        System.out.println(al.size());  //計算大小

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("seattle");
        al2.add("sydney");
        System.out.println(al2);

        al.addAll(al2);    //合併元素
        System.out.println(al);
        System.out.println(al.get(3));   //訪問元素
        al.set(3, "Calgary");    //修改元素
        System.out.println(al);
        al.remove(4);
        System.out.println(al);
    }
}
/*
           Array                  ArrayList
       初始必須給定大小       大小動態(初始就指定大小，也可以不指定代大小)
     不能隨意添加/刪除元素       可以任意位置插入/刪除元素
 */
