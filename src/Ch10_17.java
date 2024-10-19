class Animal2 {
    void jumping() {
        System.out.println("動物正在跳");
    }
}

class Cat2 extends Animal2 {
    //@註解
    @Override
    void jumping() {
        System.out.println("貓咪跳幾步:");
    }
}

public class Ch10_17 {
    public static void main(String[] args) {
        Cat2 cat2 = new Cat2();

        cat2.jumping();
    }
}
