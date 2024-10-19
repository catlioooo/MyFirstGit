class TaipeiBank {
    int account;
    int balance;

    //void 叫做不回傳值，其他就是回傳值
    boolean saveMoney(int save) {
        if (save > 0) {
            balance = balance + 1000;
            return true; //傳回 true
        }
        //一行得時候不管甚麼程式都可以不用大括號{}
        else
            return false; //傳回 false
    }

    void printInfo() {
        System.out.println("account:" + account + " balance:" + balance);
    }

    public class Ch6_5 {
        public static void main(String[] args) {
            TaipeiBank taipeiBank = new TaipeiBank();
            taipeiBank.account = 100001; //設定帳號
            taipeiBank.balance = 0;      //初始化存款0

            taipeiBank.printInfo();
            System.out.println("存款" + (taipeiBank.saveMoney(1000) ? "成功" : "失敗")); //? : -> if else
            taipeiBank.printInfo();  //存款
            System.out.println("存款" + (taipeiBank.saveMoney(-1000) ? "成功" : "失敗"));
            taipeiBank.printInfo();      //存款後
        }
    }
}