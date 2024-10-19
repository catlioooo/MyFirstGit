public class Ch8_4 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;
        //int max1, max2;
        //max1 = Math.max(i, j);
        //max2 = Math.max(max1, k);

        int max, min; //精簡寫法
        max = Math.max(Math.max(i, j), k);

        System.out.println(max);

        min = Math.min(Math.min(i, j), k);
        System.out.println(min);
    }
}
