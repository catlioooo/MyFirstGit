import java.time.Instant;

public class Ch9_6 {
    public static void main(String[] args) {
        //間距時間 end - start
        Instant end, start;

        start = Instant.now();
        System.out.println(start);
        for (int i = 0; i <= 10; i++) {
            System.out.println("你好 這是Java第九章");
        }
        end = Instant.now();
        System.out.println(end);
    }
}
