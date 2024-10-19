public class Ch4_6 {
    public static void main(String[] args) {
        //迴圈標籤
        outerloop:for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("*");   //印列乘號
                if (j >= i) {
                    System.out.println("");
                    continue outerloop;
                }
            }
        }
    }
}
