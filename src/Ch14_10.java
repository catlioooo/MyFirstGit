//interface Bird {
//
//    default void fly() {
//        System.out.println("鳥在飛");
//    }
//}

//interface Airplane {
//    default void fly() {
//        System.out.println("飛機飛");
//    }
//}

//class Flyinfo implements Airplane, Bird {
//    //重新定義default方法
//    public void fly() {
//        System.out.println("正在飛");
//        Bird.super.fly();
//        Airplane.super.fly();
//    }
//}


//public class Ch14_10 {
//    public static void main(String[] args) {
//        Flyinfo f = new Flyinfo();
//        f.fly();
//    }
//}
