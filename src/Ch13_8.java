import java.util.InputMismatchException;
import java.util.Scanner;

public class Ch13_8 {
    public static void inputData() throws ArithmeticException, InputMismatchException {
        int i, j;
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入2個整數");
        i = scanner.nextInt();
        j = scanner.nextInt();
        System.out.println(i / j);
    }

    public static void main(String[] args) {

        try {
            inputData();
        } catch (ArithmeticException e) {  //相比Ch13_2，這種方式可以更容易擴充
            System.out.println("錯誤:" + e);
        } catch (InputMismatchException e) {  //相比Ch13_2，這種方式可以更容易擴充
            System.out.println("錯誤:" + e);
        }
    }
}
