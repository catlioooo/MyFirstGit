//寫法同Ch10_24
class OuterClass {
    void display() {
        int i = 10;
        class InnerClass {
            int printInfo() {
                System.out.println("內部類別方法");
                return i;
            }
        }
        InnerClass innerClass = new InnerClass();
        System.out.println(innerClass.printInfo());
    }
}

public class Ch10_26 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.display();
    }
}
