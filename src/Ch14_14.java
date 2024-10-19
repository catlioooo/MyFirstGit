interface A {

    default void running() {
        System.out.println("1");
    }
}

interface B {

    default void running() {
        System.out.println("2");
    }
}

interface C {
    default void running() {
        System.out.println("3");
    }
}

class D implements B, C {
    public void running() {
        System.out.println("4");
    }

    public void walking() {
        System.out.println("4");
        B.super.running();
        C.super.running();
    }
}

public class Ch14_14 {
    public static void main(String[] args) {
        D d = new D();
        d.running();
        d.walking();
    }
}
