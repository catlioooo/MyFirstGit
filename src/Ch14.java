interface Run{
    void running();
}
class Lion implements Run{
    @Override
    public void running() {
        System.out.println("Lion is running");
    }
}

class Tiger implements Run{
    @Override
    public void running() {
        System.out.println("Tiger is running");
    }
}

public class Ch14 {
    public static void main(String[] args) {
        /*
        類別(class)
            -一般類別
            -抽象類別(anstraction class) ->部分抽象 partial abstraction class
        介面(interface)                 ->完全抽象 fully abstraction class
        interface 名稱{
              // <n>
              // <v>
        }
        example:
        interface MyInterface{
             int i = 10;         //java編譯器(compiler)會自動加上public static final
             void myMethod();    //java編譯器(compiler)會自動加上public abstract *****
         */
        Run lion = new Lion();
        lion.running();
        Run tiger = new Tiger();
        tiger.running();
    }
}
