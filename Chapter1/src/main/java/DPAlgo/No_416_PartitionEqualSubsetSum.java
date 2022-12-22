package DPAlgo;

/**
 * @author huangbentai
 * @date 2022/12/22 12:47
 */

/**
 * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 */
public class No_416_PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int[] nums = {1,5,11,5};

        System.out.println(canPartition(nums));

    }
    // dp
    public static boolean canPartition(int[] nums) {
        int target = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
        }
        target = sum / 2;
        //System.out.println(target);

        // 定义DP数组
        int[] dp = new int[target + 1];

        for (int i = 0; i < nums.length; i++) {
            for (int j = target; j >= nums[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - nums[i]] + nums[i] );
            }
        }

        //StringUtils.printDp1(dp);
        return dp[target] == target;
    }

}
