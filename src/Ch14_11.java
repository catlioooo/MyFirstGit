//一個類別同時繼承類別實作介面
interface Bird {
    void walk();
}

class Airplane {
    void fly() {
        System.out.println("我是飛機");
    }
}

class FlyInfo extends Airplane implements Bird {
    public void walk() {
        System.out.println("拿資訊");
    }
}


public class Ch14_11 {
    public static void main(String[] args) {
        FlyInfo f = new FlyInfo();
        f.walk();
        f.fly();
    }
}
