class Person {
    int age;            //每一個物件都有一份此資料
    String name;        //每一個物件都有一份此資料

    void printInfo() {
        System.out.println("Name" + name);
        System.out.println("age=" + age);
    }
}


public class Ch7_14 {
    public static void main(String[] args) {
        //static 靜態:不需要去建物件(不需要實體(instance))
        Person p1 = new Person();
        p1.name = "Bunny";
        p1.age = 30;

        Person p2 = new Person();
        p2.name = "Ken";
        p2.age = 24;

        p1.printInfo();
        p2.printInfo();
    }
}
