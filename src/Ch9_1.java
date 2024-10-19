import java.time.LocalDate;

public class Ch9_1 {
    public static void main(String[] args) {
        //Ch9中的 Date date =new Date() 已經過時
        LocalDate localDate = LocalDate.now();
        System.out.println("現在的時間:" + localDate);
    }
}
