abstract class Payment {
    abstract void makepay();

    void printReceipt() {
        System.out.println("print receipt");
    }
}

class credit extends Payment{
    @Override
    void makepay() {
        System.out.println("Use credit card");
    }
}

class Cash extends Payment{
    @Override
    void makepay() {
        System.out.println("Use cash");
    }
}


public class Ch11_7 {
    public static void main(String[] args) {

    }
}
