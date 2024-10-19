//class Father {
//    int i = 1;
//}
//
//class Son extends Father {
//    int i = 2;
//}
//
//public class Ch10_9 {
//    public static void main(String[] args) {
//        Father father = new Father();
//        Son son = new Son();
//        System.out.println("父親的i=" + father.i);
//        System.out.println("兒子的i=" + son.i);
//    }
//}

class Father {
    protected int i = 1;
}

class Son extends Father {
    protected int i = 2;
    void printInfo(){
        System.out.println("父親的i=" + super.i);
        System.out.println("兒子的i=" + i);
    }
}

public class Ch10_9 {
    public static void main(String[] args) {
        Father father = new Father();
        Son son = new Son();
        son.printInfo();
    }
}
