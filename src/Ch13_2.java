import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch13_2 {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入2個整數");
        //用多個catch捕捉多個exceptions
        try {
            i = scanner.nextInt();
            j = scanner.nextInt();
            System.out.println(i / j);
        } catch (ArithmeticException e) {
            System.out.println("除數為0的錯誤:" + e);   //喜歡用e 原因是"e"xception，其實可以用其他名字
        } catch (InputMismatchException e) {
            System.out.println("輸入資料型態錯誤:" + e);
        }
    }
}