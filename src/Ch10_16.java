//overload也可以在繼承extends上，要注意，就不會override
//class Animal2 {
//     void  jumping() {
//        System.out.println("動物正在跳");
//    }
//}
//
//class Cat2 extends Animal2 {
//    void jumping(int i ) {
//        System.out.println("貓咪跳幾步:" + i);
//    }
//}
//
//public class Ch10_16 {
//    public static void main(String[] args) {
//        Cat2 cat2 = new Cat2();
//
//        cat2.jumping();
//        cat2.jumping(100);
//    }
//}