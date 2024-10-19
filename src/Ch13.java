public class Ch13 {
    public static int div(int x, int y) {
        if (y == 0) {
            System.out.println("是0欸!笨蛋");
            return 0;
        } else {
            return x / y;
        }
    }

    public static void main(String[] args) {
        //語法錯誤(syntax error):像程式後面沒加分號(;)
        //語意錯誤(semantic error):像程式求周長卻打成pi*r^2(面積公式)
        //執行錯誤(runtime error):像除以0

        System.out.println(div(6, 2));
        System.out.println(div(9, 3));
        System.out.println(div(5, 0));
    }
}
