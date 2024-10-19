//基本介面的繼承

interface Animall {
    void printInfo();               //抽象 printInfo 方法
}

interface horse extends Animall {   //定義 interface horse 繼承 Animall
    void running();                 //抽象 running 方法
}

class Donkey implements horse {
    @Override
    public void printInfo() {
        System.out.println("i am animall");
    }

    @Override
    public void running() {
        System.out.println("i am running");
    }
}

public class Ch14_2 {
    public static void main(String[] args) {
        Donkey donkey = new Donkey();
        donkey.printInfo();
        donkey.running();
    }
}
