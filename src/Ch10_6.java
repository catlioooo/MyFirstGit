//class Animal{
//    //protected 是介於private 與 public之間的存取權限
//    //protected 用在繼承，讓繼承的人可以看到父類別
//    protected String name;   //宣告 protected
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
//    Bird(String name){
//        super(name);
//    }
//    void flying(){
//        System.out.println( name + "正在飛~~~~");
//    }
//}
//public class Ch10_6 {
//    public static void main(String[] args) {
//        Bird bird = new Bird("Teresa");
//        bird.eating();
//        bird.sleeping();
//        bird.flying();
//    }
//}
//
