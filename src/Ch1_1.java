public class Ch1_1 {
    public static void main(String[] args) {
        //變數的命名是有意義，盡量不要亂命名
        //每一行都要以分號做結尾
        //int是宣告的意思

        /*
        int hour_salary; //時薪
        int month_salary; //月薪
        int annual_salary; //年薪
        //以上命名法稱為snake_type 蛇式 ex:python
         */

        int hourSalary; //時薪
        int monthSalary; //月薪
        int annualSalary; //年薪
        //以上命名法稱為camel_type 駝峰式 ex:c/c++/java...oop

        /*
        int hour-salary; //時薪
        int month-salary; //月薪
        int annual-salary; //年薪
        //以上命名法稱為B-B-Q 式 ex:html/css
         */

        //變數命名的規則
        /*
        1***.可以英文開頭，數字不能開頭，但是!!數字放在裡面是可以的
        2**.可以_(底線)開頭
        3**.$可以開頭
        4.變數長度沒有限制
        5***.英文大小寫是敏感的 EX. int SUM 跟 int sum 是不一樣的!!!!!
          int Sum 跟 int sum 有一樣嗎?NO!!!不一樣
        6.因為Unicode的關係，所以可以用中文當變數(最好不要) ex. int 高老師
         */

        /*
        int 3y;  //NO
        INT y3;  //yes
        int y3y; //yes

        int x y; //NO 不能有空格
        int x-y; //NO 電腦會以為是減號
        int x+y; //NO 理由同上

        int _x   //yes
        int ___x //yes 只要第一個是底線，不管多少個都可以
         */

        //基本資料型態 primitive data types
        /*
        1.整數(integer, int)和浮點數(floating point, fp)(小數)
         (依大小區分)
         1.1 byte    (8位元)
         1.2 short   (16位元)
         1.3 int     (32位元)
         1.4 long    (64位元)

         1.5 float   (32位元)
         1.6 double  (64位元)
        2.字元(character,char)
        3.布林值(boolean):True / False

         */

        double d = 1.05; //雙倍精準浮點數 // =:assign 1.05 = d
        System.out.println(d); //println:自動換行
        System.out.println(d); //println:自動換行

        d = .789; //前面系統會自動幫你補0
        System.out.println(d);

        d = 7; //系統會自動在整數後幫你補0
        System.out.println(d);

        float f = 1.05f;
       //f; //因為Java預設浮點數是double，所以float要加上f或F (背背背!!!)
        //double是float在記憶體空間的兩倍大
        //f = 1.05f;
        //f = 1.05F;
        //有些程式設計師習慣會在double後面加上d
        d = 1.05d;

        char ch = 'a';
        //給予字元時要記得加上單引號' '，印字串才是雙引號" "
        System.out.println(ch);
        ch = '莊';
        System.out.println(ch);

        //超過一個字的時候，我們給他一個名字叫字串(String) S要大寫!!
        String  str;
        str = "I Love Java"; //給予字串值時要記得加上雙引號" "
        System.out.println(str);


        int i = 6;
        i = 8;
        i = 10;
        System.out.println(i);

        final int j = 7; //final 定值常數 不可再更改
        //j = 9; 所以不能再復值
        System.out.println(j);

        final double pi = 3.1415926;
        int r = 5;
        System.out.println( r * r * pi ); //計算圓面積

        //記憶體叫RAM
    }
    }
