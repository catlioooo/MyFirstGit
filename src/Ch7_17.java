class Member {
    static String name;     //所以物件共享一份資料
    String level;           //每一個物件都有一份此資料


    static {                //static的初始區塊
        name = "Bunny";
    }

    Member(String level) {
        this.level = level;
    }

    void printInfo() {
        System.out.println("name=" + name);
        System.out.println("level=" + level);
    }
}


public class Ch7_17 {
    public static void main(String[] args) {
        Member m1 = new Member("Gold");
        Member m2 = new Member("Silver");

        m1.printInfo();
        m2.printInfo();
    }
}
