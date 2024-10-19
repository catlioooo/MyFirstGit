import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch13_3 {
    public static void main(String[] args) {
        int i, j;
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入2個整數");

        try {
            i = scanner.nextInt();
            j = scanner.nextInt();
            System.out.println(i / j);
        } catch (ArithmeticException | InputMismatchException e) {  //相比Ch13_2，這種方式可以更容易擴充
            System.out.println("錯誤:" + e);
        }
    }
}
