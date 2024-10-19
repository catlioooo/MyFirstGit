//join()方法:擋住其他執行緒工作，直到此執行緒完成工作，其他才能工作
//class CarRacing extends Thread {
//    String name;
//
//    CarRacing(String name) {
//        this.name = name;
//        //super(name); 也可以
//    }
//
//    public void run() {
//        for (int i = 1; i < 100; i++) {
//            try {
//                sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//            System.out.println(name + "跑第" + i + "圈");
//        }
//    }
//}

public class Ch15_3 {
//    public static void main(String[] args) {
//        CarRacing A = new CarRacing("Audi");
//        CarRacing B = new CarRacing("BMW");
//        CarRacing C = new CarRacing("Chevrolet");
//
//        A.start();
//        try {
//            A.join();
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//        B.start();
//        C.start();
//
//    }
}
