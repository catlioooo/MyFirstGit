//interface Bird {
//    int age = 5;
//    void fly();  //抽象fly方法
//}
//
//interface Airplane {
//    int age = 10;
//    void fly();  //抽象fly方法
//}
//
//class Flyinfo implements Airplane,Bird {
//    @Override
//    public void fly() {    //實作fly()方法
//        System.out.println("正在飛");        //產生ambiguous
//        System.out.println(Airplane.age);   //介面名稱.成員名稱
//        System.out.println(Bird.age);       //介面名稱.成員名稱
//    }
//}
//
//
//public class Ch14_6 {
//    public static void main(String[] args) {
//        Flyinfo f = new Flyinfo();
//        f.fly();
//    }
//}
