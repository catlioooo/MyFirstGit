//interface Bird {
//    String getInfo();
//
//
//    default String fly(){     //因為用的default，可以實做直接寫在interface裡面
//        return "正在飛";
//    }
//    default String walk(){
//        return "正在走";
//    }
//}
//
//class FlyInfo implements Bird {
//    @Override
//    public String getInfo() {
//        return "拿資訊";
//    }
//}
//
//
//public class Ch14_8 {
//    public static void main(String[] args) {
//        FlyInfo f = new FlyInfo();
//        System.out.println(f.getInfo());
//        System.out.println(f.fly());
//        System.out.println(f.walk());
//        System.out.println(f.getInfo());
//    }
//}
