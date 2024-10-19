class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void eating() {
        System.out.println(name + "正在吃");
    }
}

class Mammal extends Animal {

    protected String food;
    Mammal(String name , String food) {
        super(name);
        this.food = food;
    }

    void drinking() {
        System.out.println(name + "正在喝");
    }
}

class Kangaroo extends Mammal {

    Kangaroo(String name , String food) {
        super(name , food);
    }

    void jumping() {
        System.out.println(name + "正在跳");
    }
}

//多層繼承
public class Ch10_8 {
    public static void main(String[] args) {

        Kangaroo kangaroo = new Kangaroo("Kimmy" , "grass");
        kangaroo.eating();    //呼叫本身函式
        kangaroo.jumping();   //呼叫父母函式
        kangaroo.drinking();  //呼叫祖父母函式
    }
}
