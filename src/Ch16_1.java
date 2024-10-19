import java.util.LinkedList;

// *** LinkList ***
/*
     添加元素 : add()
     添加元素在第一位 : addFirst()
     添加元素在最後一位 : addLast()
     移除第一位元素 : removeFirst()
     移除最後一位元素 : removeLast()
     訪問第一位元素 : getFirst()
     訪問最後一個元素 : getLast()
 */
public class Ch16_1 {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("Toronto");
        ll.add("Taipei");
        ll.add("Tokyo");
        ll.add("Toronto");
        System.out.println(ll);

        ll.addFirst("Calgary");
        ll.addLast("Quebec");
        System.out.println(ll);

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);

    }
}
