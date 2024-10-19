//static 靜態:不需要去建物件(不需要實體(instance))
class Person3 {
    //static 不可亂放
    static int age;      //所以物件共享一份資料
    String name;         //每一個物件都有一份此資料

    Person3(String name) {
        this.name = name;
    }

    void printInfo() {
        System.out.println("Name" + name);
        System.out.println("age=" + age);
    }
}


public class Ch7_16 {
    public static void main(String[] args) {
        Person3.age = 100;
        Person3 p1 = new Person3("Bunny");
        Person3 p2 = new Person3("Chen");

        p1.printInfo();
        p2.printInfo();

        Person3.age = 500;
        p1.printInfo();
        p2.printInfo();
    }
}
