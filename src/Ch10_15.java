//重新定義(覆寫)(override)不能重新定義final
//class Animal2 {
//    final void  jumping() {
//        System.out.println("動物正在跳");
//    }
//}
//
//class Cat2 extends Animal2 {
//    void jumping() {
//        System.out.println("貓咪在跳");
//    }
//}
//
//public class Ch10_15 {
//    public static void main(String[] args) {
//        Animal2 animal2 = new Animal2();
//        Cat2 cat2 = new Cat2();
//
//        animal2.jumping();
//        cat2.jumping();
//    }
//}