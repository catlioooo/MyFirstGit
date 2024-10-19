public class Ch13_5 {
    public static void main(String[] args) {
        //前面講了捕捉單一例外、多個例外、利用上層捕捉例外
        //catch要()
        //try 不要()
        //***finally
        try {
            String str = "GTalent";
            char c = str.charAt(2);
            System.out.println("c字元是:" + c);
//            c = str.charAt(10);   //異常發生
//            System.out.println("c字元是:" + c);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("超過範圍:" + e);
        } finally {
            //考點一:不論有無捕捉到例外，程式仍然會執行finally
            //考點二:是finally,不是final
            //考點三:break, continue, return，也一定會執行finally
            System.out.println("finally 區塊");
        }
        System.out.println("try-catch-finally 外面區塊");
    }
}
