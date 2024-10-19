class Company {
    void printInfo() {
        System.out.println("公司簡介");
    }
}

class Department extends Company {
    void printInfo() {
        System.out.println("部門簡介");
    }

    void printInfo2() {
        System.out.println("部門簡介2");
    }
}

public class Ch10_23 {
    public static void main(String[] args) {
        Company company = new Department();     //upcasting
        company.printInfo();
        //instanceof 關鍵字
        if (company instanceof Department) {
            Department department = (Department) company; //downcasting
            department.printInfo();
            department.printInfo2();
        }
    }
}
