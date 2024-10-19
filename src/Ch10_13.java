//重新定義(覆寫)(override)子類別存取權限不可比父類別小***
//public void jumping() > protected void jumping()
//class Animal2 {
//    protected void jumping() {
//        System.out.println("動物正在跳");
//    }
//}
//
//class Cat2 extends Animal2 {
//    public void jumping() {
//        System.out.println("貓咪在跳");
//    }
//}
//
//public class Ch10_13 {
//    public static void main(String[] args) {
//        Animal2 animal2 = new Animal2();
//        Cat2 cat2 = new Cat2();
//        cat2.jumping();
//    }
//}
