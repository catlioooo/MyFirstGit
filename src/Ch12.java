public class Ch12 {
    public static void main(String[] args) {
        //Wrapper class (包裝類別)
        /*
             primitive v.s. Wrapper(同物件架構一樣放在heap裡)
             int            Integer
             float          Float
             double         Double
             char           Char
             boolean        Boolean
             short          Short
             long           Long
         */
        //自動封箱 (autoboxing) 或稱 封箱 (boxing)
        //拆箱 (unboxing)

        //封箱(boxing)的實例
        int x = 5;
        Integer IObj = x;

        //拆箱 (unboxing)的實例
        Integer y = 100;
        y = y + 10;  // unboxing
        System.out.println(y);
    }
}
