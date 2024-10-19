//抽象類別就是一個模板
//子類別會對模板進行擴展與建構
//*** abstract 抽象類別是不能建立物件 new
abstract class Bank {
    abstract void withDraw();
    /*
    抽象方法:
       1)沒有body
       2)記得要加 ;
       3)要被override
       4)*** 抽象方法 --> 類別(class)一定要加上abstract
     */
}

class SunnyBank extends Bank {
    void withDraw() {
        System.out.println("SunnyBank");
    }
}

class CiticBank extends Bank {
    void withDraw() {
        System.out.println("CiticBank");
    }
}

public class Ch11_1 {
    public static void main(String[] args) {
        //嘗試建立抽象類別物件 -> 產生編譯錯誤
        //Bank bank = new Bank();
    }
}

