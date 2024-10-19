////在執行多型的upcasting觀念，成員(名詞)變數不適用的
//
//class Bank {
//   int money = 100001;
//}
//
//class SunnyBank extends Bank {
//   int money = 10002;
//}
//
//class CiticBank extends Bank {
//   int money = 1003;
//}
//
//public class Ch10_20 {
//    public static void main(String[] args) {
//        Bank b = new SunnyBank();   //upcasting
//        System.out.println("Bank:" + b.money);
//    }
//}