package DPAlgo;

/**
 * @author huangbentai
 * @date 2022/12/16 15:40
 */

/**
 * 斐波那契数 （通常用 F(n) 表示）形成的序列称为 斐波那契数列 。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。
 */
public class No_509_FibonacciNumber {
    public static void main(String[] args) {
        System.out.println(fib(3));
    }

    public static int fib(int n) {

        int f0 = 0;
        int f1 = 1;
        if (n == 0) {
            return f0;
        }
        if (n == 1) {
            return f1;
        }

        int ans = 0;

        for (int i = 2; i <= n; i++){
            ans = f0 + f1;
            f0 = f1;
            f1 = ans;
        }

        return ans;

    }
}
