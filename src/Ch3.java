import java.util.Scanner; //import 就是輸入
/*
學會鍵盤資料
學會if(條件判斷){
   程式敘述區塊
}
 */


public class Ch3 {
    public static void main(String[] args) {
        int age;
        Scanner scanner = new Scanner(System.in);//做輸入，背下來

        System.out.println("請輸入年齡 :");
        age = scanner.nextInt(); //讀取輸入的資料


        //if (age < 18){
        //    System.out.println("您不能開車，因為年齡太小");
        //    System.out.println("要等您18歲後");
        //}

        //假設今天 程式敘述區塊 只有一行，左右大括號{}可以拿掉
        //這是程式新手小白常犯錯誤，不論if 是否成立 第二行("要等您18歲後")都會印出來
        //if (age < 18)
        //    System.out.println("您不能開車，因為年齡太小");
        //    System.out.println("要等您18歲後");

        if (age < 18) {
            System.out.println("您不能開車，因為年齡太小");
            System.out.println("要等您18歲後");
        }
        else{
            System.out.println("恭喜你大於18歲");
            System.out.println("可以開車囉");
        }

        //再談三元運算子
        /*
        if (a>b){
            c = a;
        }
        else{
            c = b;
        }
        // e1 ? e2 : e3 -->如果e1是true，則執行e2，否則執行e3
        // c = (a>b)? a : b; 此行同上
         */


        //if...else if...else
        /*
        if(條件判斷一){
             程式敘述區塊
        }

        else if(條件判斷二){
             程式敘述區塊
        }
        ...
        else{
             程式敘述區塊
        }
        //else if 可以很多個
         */
    }
}
