//class CarRacing implements Runnable {
//    String name;
//
//    CarRacing(String name) {              //建構方法
//        this.name = name;
//    }
//
//    public void run() {                   //實作方法run()方法
//        for (int i = 1; i < 100; i++) {
//            System.out.println(name+ "跑第" + i + "圈");
//        }
//    }
//}
//
//public class Ch15_1 {
//    public static void main(String[] args) {
//        CarRacing A = new CarRacing("A");
//        CarRacing B = new CarRacing("B");
//
//        Thread t1 = new Thread(A);
//        Thread t2 = new Thread(B);
//        t1.start();
//        t2.start();
//    }
//}
