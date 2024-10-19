////Default method (default 方法)
//
//interface Bird {
//    int age = 5;
//
//
//    default void fly(){     //因為用的default，可以實做直接寫在interface裡面
//        System.out.println("正在飛");
//    }
//}
//
//class FlyInfo implements Bird {
//    public void flyInfo() {
//        System.out.println("鳥在飛");
//    }
//}
//
//public class Ch14_7 {
//    public static void main(String[] args) {
//        Flyinfo f = new Flyinfo();
//        f.fly();
//    }
//}
