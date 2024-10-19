////何時會用到downcasting會用在哪裡? 一般向上轉型後，因該物件的其他方法會被遮蔽
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
//    void printInfo2(){
//        System.out.println("部門簡介2");
//    }
//}
//
//public class Ch10_22 {
//    public static void main(String[] args) {
//        Company company = new Department();     //upcasting
//        company.printInfo();
//        //company.printInfo2();               //被遮蔽，開不到
//        Department department = (Department) company; //downcasting
//        department.printInfo();
//        department.printInfo2();
//    }
//}
