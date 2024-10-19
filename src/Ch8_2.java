public class Ch8_2 {
    public static void main(String[] args) {
        // 丟骰子 (隨機印出1~6)
        // 隨機印出1~6
        // Math.random() * (MAX - min +1) + min**
        int r = 0; //先初始化
        r =(int) (Math.random() * (6 - 1 + 1)) + 1;
        System.out.println("隨機印出1~6=" + r);
    }
}
