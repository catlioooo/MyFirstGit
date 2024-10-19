//wait(), notify()
class HuananBank {
    int balance = 1000;   // 銀行餘額

    public synchronized void withdraw(int money) {
        System.out.println("提款餘額不足，等待存款");
        try {
            wait();  //wait()要放在try-catch裡面
        } catch (Exception e) {
            System.out.println(e);
        }
        balance = balance - money;
        System.out.println("已提款完成");
    }

    public synchronized void save(int money) {
        System.out.println("存款");
        balance = balance + money;
        System.out.println("已收到存款");
        notify();   //通知
    }
}

public class Ch15_5 {
    public static void main(String[] args) {
        HuananBank h = new HuananBank();
        Thread t1 = new Thread() {
            public void run() {
                h.withdraw(15000);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                h.save(15000);
            }
        };
        t1.start();
        t2.start();
    }
}
