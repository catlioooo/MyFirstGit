////巢狀類別 (Nested class):基於安全性的理由
///*
//class OuterClass{
//    class InnerClass}
//    ...
// */
//
//class  OuterClass{
//    private class InnerClass{
//        void printInfo(){
//            System.out.println("內部類別方法");
//        }
//    }
//    void display(){
//        InnerClass i = new InnerClass();
//        i.printInfo();
//        System.out.println("外部類別方法");
//    }
//}
//
//public class Ch10_24 {
//    public static void main(String[] args) {
//        OuterClass o = new OuterClass();
//        o.display();
////      o.printInfo();  錯誤寫法
//    }
//}
