public class Ch13_1 {
    public static int div(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {   //e-> "e"xception
            System.out.println("錯誤" + e);
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(div(6, 2));
        System.out.println(div(9, 3));
        System.out.println(div(5, 0));
    }
}
/*
Try-catch
 */
