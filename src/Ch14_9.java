//interface Bird {
//    int age = 5;
//
//    default void fly() {
//        System.out.println("鳥在飛");
//    }
//}
//
//interface Airplane {
//    default void fly() {
//        System.out.println("飛機飛");
//    }
//}
//
//class Flyinfo implements Airplane, Bird {
//    //重新定義default方法
//    public void fly() {
//        System.out.println("正在飛");
//    }
//}
//
//public class Ch14_9 {
//    public static void main(String[] args) {
//        Flyinfo f = new Flyinfo();
//        f.fly();
//    }
//}
