class DMath {
    //會造成模糊錯誤
    //void add(long x, int y) {
    //    System.out.println(x + y);
    //}
    //會造成模糊錯誤
    //void add(int x, long y) {
    //    System.out.println(x + y);
    //}
}

public class Ch7_10 {
    public static void main(String[] args) {
        //可以升級為int, long, float,double
        //int 可以升級為long, float, double
        DMath dMath = new DMath();
        //dMath.add(1, 2); //不升級為long
    }
}