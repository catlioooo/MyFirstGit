import java.sql.SQLOutput;
import java.time.LocalTime;

public class Ch9_3 {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println("現在的時間:" + localTime);
        System.out.println("時:" + localTime.getHour());
        System.out.println("分:" + localTime.getMinute());
        System.out.println("秒:" + localTime.getSecond());
    }
}
