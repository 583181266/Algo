import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayList;

// 注意类名必须为 Main, 不要有任何 package xxx 信息
public class Demo15 {

    public static void main(String[] args) {

        // 辗转相除法  最小公倍数
        int n = 4;
        int m = 2;
        System.out.println(gcd(n, m));



    }
    // 最大公约数
    public static int gcd(int a, int b) {

        return b == 0 ? a : gcd(b, (a % b));
    }


}