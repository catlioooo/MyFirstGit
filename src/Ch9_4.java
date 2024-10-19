import java.time.LocalDateTime;

public class Ch9_4 {
    public static void main(String[] args) {
        //Ch9_2 ->Date (LocalDate)
        //Ch9_3 ->Time (LocalTime)
        //Ch9_4 ->Date+Time (LocalDateTime)
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("現在的日期與時間:" + localDateTime);
        System.out.println("年份:" + localDateTime.getYear());
        System.out.println("月份:" + localDateTime.getMonthValue());
        System.out.println("日期:" + localDateTime.getDayOfMonth());
        System.out.println("時:" + localDateTime.getHour());
        System.out.println("分:" + localDateTime.getMinute());
        System.out.println("秒:" + localDateTime.getSecond());
    }
}
