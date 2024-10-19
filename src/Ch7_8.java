class BMath {
    void add(long x, int y) {
        System.out.println(x + y);
    }

    void add(int x, int y, int z) {
        System.out.println(x + y + z);
    }
}

public class Ch7_8 {
    public static void main(String[] args) {
        //可以升級為int, long, float,double
        //int 可以升級為long, float, double
        BMath bMath = new BMath();
        bMath.add(1, 2); //第一參數由int升級為long
        bMath.add(1, 2, 3);
    }
}
