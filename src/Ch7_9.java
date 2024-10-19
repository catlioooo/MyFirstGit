class CMath {
    void add(long x, int y) {
        System.out.println(x + y);
    }

    void add(int x, int y) {
        System.out.println(x + y);
    }
}

public class Ch7_9 {
    public static void main(String[] args) {
        //可以升級為int, long, float,double
        //int 可以升級為long, float, double
        CMath cMath = new CMath();
        cMath.add(1, 2); //不升級為long
    }
}
