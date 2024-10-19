import java.util.TreeMap;

//TreeMap
public class Ch16_6 {
    public static void main(String[] args) {
        TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
        tm.put(101,"Columbia");
        tm.put(105,"New York");
        tm.put(103,"Hong kong");
        System.out.println(tm);
    }
}
