import java.time.LocalDate;

public class Ch9_2 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("現在的時間:" + localDate);
        System.out.println("年份" + localDate.getYear());
        System.out.println("月份" + localDate.getMonth());         //英文呈現
        System.out.println("月份" + localDate.getMonthValue());    //數字呈現
        System.out.println("日期" + localDate.getDayOfMonth());
    }
}
