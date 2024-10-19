public class Ch13_6 {
    public static int div(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("==============");
            System.out.println(e.getMessage());  //印原因就好
            System.out.println("==============");
            e.printStackTrace();  //印錯誤出來，沒寫就印不出錯誤
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println(div(6,0));
    }
}
