import java.util.Arrays;

class Watch {
    private String getType() {
        return "Watch";
    }

    public String getName(String suffix) {
        return getType() + suffix;
    }
}

class SmartWatch extends Watch {
    private String getType() {
        return "smart watch";
    }

    public String getName() {
        return getType() + ",";
    }
}



public class test22 {
    public static void main(String[] args) {
        SmartWatch smartWatch = new SmartWatch();
        Watch watch = new Watch();
        System.out.println(watch.getName(","));
        System.out.println(smartWatch.getName(""));
    }
}
