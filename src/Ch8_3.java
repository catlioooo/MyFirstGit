public class Ch8_3 {
    public static void main(String[] args) {
        //產生六筆1~42 數字
        int[] lottery = new int[6];

        for (int i = 0; i < 6; i++) {
            lottery[i] = (int) (Math.random() * (42 - 1 + 1)) + 1;
            System.out.printf("%d ", lottery[i]);
        }

    }
}
