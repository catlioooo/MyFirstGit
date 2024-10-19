////讓執行緒睡眠sleep()
//class CarRacing extends Thread {
//    String name;
//
//    CarRacing(String name) {
//        this.name = name;
//    }
//
//    public void run() {
//        for (int i = 1; i < 100; i++) {
//            //sleep要放在try-catch裡面，不然會報錯
//            try {
//                sleep(500);
//            } catch (InterruptedException e) {
//                System.out.println(e);
//            }
//        }
//    }
//}
//
//public class Ch15_2 {
//    public static void main(String[] args) {
//        CarRacing A = new CarRacing("Audi");
//        CarRacing B = new CarRacing("BMW");
//        A.start();
//        B.start();
//    }
//}
