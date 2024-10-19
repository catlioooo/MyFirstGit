//以下是類別(要先開)
class Cat {
    String name;
    int age;
    String color;

    void sleep() {
        System.out.println("我正在睡覺");
    }

    void eat() {
        System.out.println("我正在吃飯");
    }

    void run() {

    }
}

public class Ch6_1 {
    public static void main(String[] args) {
        //類別與物件(Java最核心的部分)，當瞭解後，就進入物件導向程式設計(Object Oriented Programming,OOP)
        /*
        物件導向:
        封裝(Encapsulation)
        抽象(Abstraction)
        繼承(inheritance)
        多型(Polymorphism)
         */

        /*
        狗是物件
           -特性(名詞)；名字、年齡、顏色，a,k,a屬性(attribute)
           -行為(動詞)；睡覺、吃、跑 a.k.a 方法(method)
         */
        int i;
        i = 6;
        Cat cat = new Cat();   //宣告與建立物件   //Dog類別 dog物件 ()動詞要小括號
        Cat Tomcat = new Cat();



        cat.name = "eggCase";
        cat.age = 5;
        cat.color = "gold";

        Tomcat.name = "Paris";
        Tomcat.age = 8;
        Tomcat.color = "white";

        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.color);

        System.out.println(Tomcat.name);
        System.out.println(Tomcat.age);
        System.out.println(Tomcat.color);

        cat.sleep();
        Tomcat.sleep();
    }
}

