public class Ch13_7 {
    public static int div(int x, int y) throws ArithmeticException {
        System.out.println(x / y);
        return 0;
    }

    public static void main(String[] args) {
        int[][] iArray = {{10, 2}, {10, 1}, {10, 0}};
        for (int i = 0; i < iArray.length; i++) {
            try {
                div(6, 3);
                div(9, 3);
            } catch (ArithmeticException e) {
                System.out.println(e);
            }
        }
    }
}
