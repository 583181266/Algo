package DPAlgo;

/**
 * @author huangbentai
 * @date 2022/12/16 20:25
 */
public class _01_BagDemo1 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value = {15, 20, 30};
        int bagsize = 4;
        System.out.println(maxValue(weight, value, bagsize));

    }

    public static int maxValue(int[] weight, int[] value, int bagsize){
        int m = weight.length;
        int[][] dp = new int[m + 1][bagsize + 1];
        // 初始化
        for (int i = 1; i <= m ; i++) { // 物品
            for (int j = 1; j <= bagsize; j++) { // 价值
                if (weight[i - 1] > j){ // 物品重量判断
                    dp[i][j] = dp[i - 1][j];
                }else {
                    dp[i][j] = Math.max(dp[i - 1][j],dp[i - 1][j - weight[i - 1]] + value[i - 1]);
                }
            }
        }

        StringUtils.printDp2(dp);
        return 0;

    }
}
