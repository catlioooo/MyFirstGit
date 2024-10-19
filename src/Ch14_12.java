//interface A {
//    void walking();
//    default void running() {
//        System.out.println("1");
//    }
//}
//
//interface B {
//    void walking();
//    default void running() {
//        System.out.println("2");
//    }
//}
//
//class C {
//    public void running() {
//        System.out.println("3");
//    }
//}
//
//class D extends C implements A, B {
//    public void walking() {
//        System.out.println("4");
//        A.super.running();
//        B.super.running();
//    }
//}
//
//public class Ch14_12 {
//    public static void main(String[] args) {
//        D d = new D();
//        d.walking();
//        d.running();
//    }
//}
