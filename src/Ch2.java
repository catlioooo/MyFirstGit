public class Ch2 {
    public static void main(String[] args) {
        //程式基本運算
        //運算子 Operator
        //運算元 Operand
        //二元運算 operand operator operand ex: 9 + 12
        //單元運算 (背)(背)(背) ex: i++(遞增 1),i--(遞減 1)
        //i++相當於 i = i + 1
        //i--相當於 i = i - 1
        //三元運算 (背)(背) ex: 運算 ? 值 : 值
        int x, value;
        x = -10;
        value = - ( x + 5) * 3;
        System.out.println(value);

        //考點!!! 浮點數/0 --> 無限大infinity
        double d;
        d = 100.0 / 0;
        System.out.println(d);

        d = -100.0 / 0;
        System.out.println(d);


        //考點 : 整數/0 -->報錯，因為分母不得為0
        //int i;
        //i = 100 / 0;
        //System.out.println(i);


        //NaN = Not a Number 非數字
        d = 5.5 % 0; //% mod 求餘數
        System.out.println(d);
        d = -5.5 % 0;
        System.out.println(d);

        //Java 優先權順序
        //1. 括號 ()
        //2. 遞增++ , 遞減-- , 正號 , 負號
        //3. 乘法 * , 除法 / , 求餘數 %
        //4. 加法 + ,減法 -

        boolean bo;
        bo = true; //在Java裡面只能用true, 不能用1/0
        System.out.println(bo);
        bo = false;
        System.out.println(bo);

        //比較運算式
        // >大於, <小於, >=, <=, == 等於, != 不等於

        //邏輯運算式 圖在line群
        // && & AND
        // || | OR
        boolean a = true;
        boolean b = false;
        System.out.println( a && a);
        System.out.println( a && b);

        System.out.println(a || a);
        System.out.println(a || b);

        // &&(||) 跟 &(|) 差別
        // &&(||):邏輯運算短路 logical short circuit
        // 左邊可以決定，就決定了吧，不要埋右邊
        System.out.println(a && b);
        System.out.println(b && a);

        //這種就是左右兩邊都要去看才能決定結果
        System.out.println( a & b);
        System.out.println( b & a);

        // ^ XOR, exclusive or:運算元相同時回傳false,否則回傳true
        /*

        a    b    a^b
        0    0     0
        0    1     1
        1    0     1
        1    1     0

         */
        //沒有這種東西: ^^
        System.out.println(a ^ a);
        System.out.println(a ^ b);

        //
        int i, j, larger,smaller; //如果i > j成立，那i就是larger，否則j就會是larger
        i = 100;
        j = 50;
        larger = i > j ? i : j;
        System.out.println(larger);

        smaller = i < j ? i : j;
        System.out.println(smaller);

        //位元運算 bitwise operation跳過
    }
}
