package DPAlgo;

import java.util.Arrays;

/**
 * @author huangbentai
 * @date 2022/12/16 19:21
 */
public class No_96_UniqueBinarySearchTrees {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(numTrees(1));
        System.out.println(numTrees(n));
        System.out.println(numTrees(4));

    }

    public static int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[i - j] * dp[j - 1];

            }
        }
        StringUtils.printDp1(dp);

        return dp[n];

    }
}
