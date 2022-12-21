package DPAlgo;

/**
 * @author huangbentai
 * @date 2022/12/16 16:08
 */

/**
 * 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。一旦你支付此费用，即可选择向上爬一个或者两个台阶。
 * <p>
 * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
 * <p>
 * 请你计算并返回达到楼梯顶部的最低花费
 */
public class No_746_MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {10, 15, 20};
        System.out.println(minCostClimbingStairs(cost));

    }

    public static int minCostClimbingStairs(int[] cost) {
        if (cost.length == 0 || cost.length == 1){
            return 0;
        }

        int f0 = 0;
        int f1 = 0;
        int sum = 0;
        for (int i = 2; i <= cost.length; i++) {
            sum = Math.min(f0 + cost[i - 2], f1 + cost[i - 1]);
            f0 = f1;
            f1 = sum;
        }

        return sum;

    }
}
