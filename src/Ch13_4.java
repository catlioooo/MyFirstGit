public class Ch13_4 {
    public static void main(String[] args) {
        //捕捉上一層的例外
        /*
             indexOutOfBoundException
                                       -ArrayIndexOutOfBoundException
                                       -StringIndexOutOfBoundException
         */
        try {
            String str = "GTalent";
            char c = str.charAt(2);
            System.out.println("c字元是:" + c);
            c = str.charAt(10);   //異常發生
            System.out.println("c字元是:" + c);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("超過範圍:" + e);
        } catch (RuntimeException e) {
            System.out.println("異常發生在其他地方"); //尚未被抓到的例外
        }
    }
}
