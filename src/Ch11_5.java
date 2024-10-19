abstract class User {
    String name;
    int id;
    String address;

    abstract void Dashboard();

    void login() {
        System.out.println("log in");
    }
}

class admin extends User {
    @Override
    void Dashboard() {
        System.out.println("admin's dashboard");
    }
}

class Guest extends User {
    @Override
    void Dashboard() {
        System.out.println("guest's dashboard");
    }
}

public class Ch11_5 {
    public static void main(String[] args) {

    }
}
