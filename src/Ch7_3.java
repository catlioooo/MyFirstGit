class SMath {
    int x, y;

    SMath(int a) {
        x = a;
    }

    SMath(int a, int b) {
        x = a;
        y = b;
    }

    void add() {
        System.out.println("加法的結果" + (x + y));
    }

}


public class Ch7_3 {
    public static void main(String[] args) {
        //多重定義(overload)***:相同的名字，不同的參數數量
        ////2.相同的名字，資料型態可以不一樣
        SMath s1 = new SMath(5);

        SMath s2 = new SMath(5,10);
    }
}
