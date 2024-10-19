class myException extends Exception{
    String str;
    myException(String str){
        this.str = str;
    }
    String printInfo(){
        return "我自定義發生的錯誤";
    }
}
public class Ch13_9 {
    public static void main(String[] args) {
        try{
            System.out.println("=======try=======");
            throw new myException("exception");//超級重要
        }catch(myException e){
            System.out.println("=======catch=======");
            e.printStackTrace();
        }
    }
}
