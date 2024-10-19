import java.util.Scanner;

public class Ch3_6 {
    public static void main(String[] args) {

        //下面是Java 17的寫法
        int name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== 百家姓 ===");
        System.out.println("請輸入姓氏");
        name = scanner.nextInt();

        switch (name) {
            case '莊' -> System.out.println("莊");

            case '李' -> System.out.println("李");

            case '王' -> System.out.println("王");

            case '林' -> System.out.println("林");

            default -> System.out.println("陳");

        }
    }
}
