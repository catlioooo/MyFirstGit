public class Ch8_8 {
    public static void main(String[] args) {
        double rate = 0.02;
        double capital = 10000;
        double tmp;
        for (int i = 1; i <= 10; i++) {
            tmp = capital * Math.pow((1 + rate), i);
            System.out.println(tmp);
        }
    }
}
