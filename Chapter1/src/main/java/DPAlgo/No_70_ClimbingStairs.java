package DPAlgo;

/**
 * @author huangbentai
 * @date 2022/12/16 15:47
 */

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 */
public class No_70_ClimbingStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(6));
    }

    public static int climbStairs(int n) {

        int dp1 = 1;
        int dp2 = 2;
        if (n == 1){
            return dp1;
        }
        if (n == 2){
            return dp2;
        }
        int sum = 0;
        for (int i = 3; i <= n; i++){
            sum = dp1 + dp2;
            dp1 = dp2;
            dp2 = sum;
        }
        return sum;
    }
}
