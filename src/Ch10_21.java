////downcasting 向下轉型
//class Company {
//    void printInfo() {
//        System.out.println("公司簡介");
//    }
//}
//
//class Department extends Company {
//    void printInfo() {
//        System.out.println("部門簡介");
//    }
//}
//
//public class Ch10_21 {
//    public static void main(String[] args) {
//        Company a = new Company();
//        Department b = (Department) a;  //downcasting 絕對不這樣寫-> Department b = (Department) new Compant();
//        a.printInfo();
//        b.printInfo();
//    }
//}
