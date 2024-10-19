//守護(Daemon) 執行緒 (Thread):
/*
     1.存在於後台，例如垃圾回收(Garbage collection, GC)執行緒
     2.優先權低的執行緒
     3.生命週期(Life cycle)跟著一般執行緒，一般執行緒停止，也跟著停止
 */
//setDaemon() 設定執行緒是否要為守護執行緒
//isDaemon(): 是否為守護執行緒

//Synchronization 同步 *****
//原因: 執行緒的特色彼此共享記憶體空間，如果沒有一個機制去處理此共享空間
//     就會造成互相干擾，記憶體內容就會有錯。
class CarRacing {
    public synchronized void printInfo(int j) {
        for (int i = 1; i < 10; i++) {
            try {
                //直接用 Thread.sleep
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("跑第" + (i * j) + "圈");
        }
    }
}

public class Ch15_4 {
    public static void main(String[] args) {
        CarRacing A = new CarRacing();
        //匿名類別 (anonymous class)
//        Thread t1 = new Thread() {
//            public void run() {
//                A.printInfo(10);
//            }
//        };    //*****要記得加分號
//        Thread t2 = new Thread() {
//            public void run() {
//                A.printInfo(5);
//            }
//        };
//          t1.start();
//          t2.start();
//    }

        //也可以這樣寫 :
        new Thread() {
            public void run() {
                A.printInfo(10);
            }
        };
        new Thread() {
            public void run() {
                A.printInfo(5);
            }
        }.start();
    }
}
