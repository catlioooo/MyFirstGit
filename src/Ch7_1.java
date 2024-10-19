class NewTaipeiBanl{
    int balance;
    //建構方法規則就是要名字跟class一模一樣
    NewTaipeiBanl(){
        balance = 0;
    }
    void printInfo(){
        System.out.println("存款金額" + balance);
    }
}
public class Ch7_1 {
    public static void main(String[] args) {
        NewTaipeiBanl newTaipeiBanl = new NewTaipeiBanl();
        newTaipeiBanl.printInfo();
    }
}