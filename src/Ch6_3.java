public class Ch6_3 {
    //這種寫法一定要用public static void(跟main一樣)
    public static void swap(int x, int y) {
        int tmp = x ;
        x = y;
        y = tmp;
        System.out.println("swap x=" + x);
        System.out.println("swap y=" + y);
    }

    public static void main(String[] args) {
        //參數傳遞的方式
        //Call by Value(傳遞值)
        //Call bt address(傳遞地址)
        int x, y;
        x = 10;
        y = 15;
        System.out.println("Before swap x=" + x);
        System.out.println("Before swap y=" + y);
        swap(x, y);
        System.out.println("After swap x =" + x);
        System.out.println("After swap y =" + y);
    }
}
