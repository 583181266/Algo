package DPAlgo;

/**
 * @author huangbentai
 * @date 2022/12/22 11:31
 */
public class _02_DP1BagDemo2 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagSize = 4;
        System.out.println(maxValue(weight, value, bagSize));
    }

    // 一维DP数组实现
    public static int maxValue(int[] w, int[] v, int bagSize) {
        // 定义dp数组
        int[] dp = new int[bagSize + 1];

        for (int i = 0; i < w.length; i++) {
            for (int j = bagSize; j >= w[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - w[i]] + v[i]);
            }
            StringUtils.printDp1(dp);
        }

        StringUtils.printDp1(dp);

        return dp[bagSize];
    }
}
