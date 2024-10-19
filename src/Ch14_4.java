//interface Bird {
//    void birdfly();
//}
//
//interface Airplane {
//    void airplanefly();
//}
//
//interface Fly extends Airplane, Bird {
//    void flygo();
//}
//
//class Flyinfo implements Fly {
//    @Override
//    public void airplanefly() {
//        System.out.println("鳥在飛");
//    }
//
//    @Override
//    public void birdfly() {
//        System.out.println("飛機在飛");
//    }
//
//    @Override
//    public void flygo() {
//        System.out.println("Flygo");
//    }
//}
//
//public class Ch14_4 {
//    public static void main(String[] args) {
//        //介面多重繼承(multiple inheritance)
//        Fly fly = new Flyinfo();
//        fly.airplanefly();
//        fly.birdfly();
//        fly.flygo();
//    }
//}
