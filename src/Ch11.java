////OOP物件導向程式:封裝、繼承、多形、抽象、介面
////抽象(abstract)
////抽象理念；隱藏工作細節
//class Bank {
//    //這裡存在的意思就是"純定義"
//    //主要是讓整個程式更加完整，他本身不處理任何工作，真正的工作是交給子類別
//    //那這樣的情況就適合"抽象類別"(abstract)
//    int withDraw() {
//        return 0;
//    }
//}
//
//class SunnyBank extends Bank {
//    int money;
//
//    SunnyBank(int money) {
//        this.money = money;
//    }
//
//    int withDraw() {
//        return 100 * money;
//    }
//}
//
//class CiticBank extends Bank {
//    int dollar;
//
//    CiticBank(int dollar) {
//        this.dollar = dollar;
//    }
//
//    int withDraw() {
//        return 10 * dollar;
//    }
//}
//
//public class Ch11 {
//    public static void main(String[] args) {
//        SunnyBank sunnyBank = new SunnyBank(5);
//        CiticBank citicBank = new CiticBank(5);
//
//    }
//}
