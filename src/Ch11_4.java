abstract class Car {
    abstract void drive();

    Car() {
        System.out.println("建構方法");
    }

    void fuel() {
        System.out.println("I need to drink gasline");
    }
}

abstract class Honda extends Car {

}

class CRV extends Honda {
    void drive() {
        System.out.println("i am driving");
    }
}

public class Ch11_4 {
    public static void main(String[] args) {
        CRV crv = new CRV();
        crv.drive();
        crv.fuel();
    }
}


