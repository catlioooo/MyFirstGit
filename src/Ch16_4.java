import java.util.TreeSet;

//TreeSet
public class Ch16_4 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<Integer>();
        ts.add(5);
        ts.add(1);
        ts.add(9);
        System.out.println(ts);
        System.out.println(ts.first());
        System.out.println(ts.last());

    }
}
