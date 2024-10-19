////分層繼承 (Hierarchical Inheritance)
////濃縮 ch10 ,ch10-1 , ch10-2
//class Animal {
//    protected String name;
//
//    void eating() {
//        System.out.println(name + "正在吃飯");
//    }
//
//    void sleeping() {
//        System.out.println(name + "正在睡覺");
//
//    }
//}
//
//class Lion extends Animal {
//    String name;
//
//    Lion(String name) {
//        this.name = name;
//    }
//
//    void barking(){
//        System.out.println(name + "正在吼");
//    }
//}
//
//class Bird extends Animal{
//    String name;
//
//    Bird(String name) {
//        this.name = name;
//    }
//
//    void flying(){
//        System.out.println(name + "正在飛");
//    }
//}
//
//
//public class Ch10_7 {
//    public static void main(String[] args) {
//        Lion lion = new Lion("Bunny");
//        lion.eating();
//        lion.eating();
//        lion.barking();
//
//        Bird bird = new Bird("Teresa");
//        bird.eating();
//        bird.sleeping();
//        bird.flying();
//    }
//}
