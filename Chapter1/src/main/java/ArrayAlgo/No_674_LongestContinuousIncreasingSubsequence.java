package ArrayAlgo;

/**
 * @author huangbentai
 * @date 2022/12/15 14:20
 */

/**
 * 给定一个未经排序的整数数组，找到最长且 连续递增的子序列，并返回该序列的长度。
 *
 * 连续递增的子序列 可以由两个下标 l 和 r（l < r）确定，如果对于每个 l <= i < r，都有 nums[i] < nums[i + 1] ，那么子序列 [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] 就是连续递增子序列。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/longest-continuous-increasing-subsequence
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No_674_LongestContinuousIncreasingSubsequence {
    public static void main(String[] args) {
        int[] nums = {};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }
        int r = 1;
        int start = 0;
        int end = 1;
        while (end < nums.length){

            if (nums[end - 1] < nums[end]){
                r = Math.max(r,((end - start) + 1));
            }else {
                start = end;
            }
            end++;

        }

        return r;
    }
}
