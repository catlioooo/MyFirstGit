import java.util.Scanner;

public class Ch4_4 {
    public static void main(String[] args) {
        //複製Ch4_3，限制只能猜5次(第五次就印密碼鎖住~BYE~)
        //用 while 迴圈

        int num;
        int pwd = 55;
        int count = 5;
        Scanner scanner = new Scanner(System.in);

        while (count > 0) {
            System.out.println("請輸入密碼");
            num = scanner.nextInt();

            if (num == pwd) {
                System.out.println("恭喜猜對!");
                break;
            } else {
                count--;
                System.out.println("猜錯了再猜一次!");
            }

        }
        if (count == 0) {
            System.out.println("密碼鎖住~BYE~");
        }
    }
}