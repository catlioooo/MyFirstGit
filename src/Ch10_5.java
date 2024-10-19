//class Animal{
//    private String name;
//    Animal(String name){
//        this.name= name;
//    }
//
//    void eating(){
//        System.out.println(name + "還在吃飯");
//    }
//    void sleeping(){
//        System.out.println(name + "還在睡覺");
//    }
//}
//class Bird extends Animal{
//    //super 繼承父類別建構方法(考點)
//    Bird(String name){
//        super(name); //super啟動父類別的建構方法，name是傳遞參數
//    }
//    void flying(){
//        System.out.println("正在飛~~~~");
//    }
//}
//public class Ch10_5 {
//    public static void main(String[] args) {
//        Bird bird = new Bird("Teresa");
//        bird.eating();
//        bird.sleeping();
//        bird.flying();
//    }
//}
