//functional Interface 功能介面*** 很重要
//介面裡面只有一個方法，我們就定義為功能介面

//lambda: 主要是應用在『功能介面』上
//() -> {}
//(參數s) -> { 運算內容 }
@FunctionalInterface
interface Calculator {
    int mul(int x);
}

public class Ch16_8 {
    public static void main(String[] args) {
//     1   Calculator calculator = (x, y) -> x + y;
//        System.out.println(calculator.add(1,2));

//     2   Calculator calculator = () -> 10;
//        System.out.println(calculator.add());

//     3   Calculator calculator = (x, y) -> x - y;
//        System.out.println(calculator.add(3,2));

        //   ->  就等於output或者sout
        //  如果參數是只有1個，是也可以去掉括號，但如果參數是2個以上，不可以去掉括號
        //   統一被法就是參數一律不要去括號 ***

        //  4
        Calculator calculator = x -> 5 * x;
        System.out.println(calculator.mul(3));
    }
}
