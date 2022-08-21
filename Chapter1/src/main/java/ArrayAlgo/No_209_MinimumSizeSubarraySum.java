package ArrayAlgo;

/**
 * 给定一个含有 n 个正整数的数组和一个正整数 s ，找出该数组中满足其和 ≥ s 的长度最小的 连续 子数组，并返回其长度。如果不存在符合条件的子数组，返回 0。
 *
 * 示例：
 *
 * 输入：s = 7, nums = [2,3,1,2,4,3] 输出：2 解释：子数组 [4,3] 是该条件下的长度最小的子数组。
 */
public class No_209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums = {2,3,1,2,4,3};
        int s = 1000;
        System.out.println(minSubArrayLen(s,nums));

    }
    public static int minSubArrayLen(int target, int[] nums) {
        int start = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target){
                result = result > (end - start + 1) ? (end - start + 1) : result;
                sum -= nums[start];
                start++;
            }

        }
        return result == Integer.MAX_VALUE ? 0 : result;

    }
}
