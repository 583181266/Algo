package tanxin;

/**
 * @author huangbentai
 * @date 2022/11/24 23:58
 */
public class No376WiggleSubsequence {
    public static void main(String[] args) {
        int[] nums = {1, 7, 4, 9, 2, 5};
        System.out.println(wiggleMaxLength(nums));
    }

    public static int wiggleMaxLength(int[] nums) {
        int preDiff = 0;
        int curDiff = 0;
        int result = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            curDiff = nums[i] - nums[i + 1];
            if ((preDiff >= 0 && curDiff < 0) || (preDiff <= 0 && curDiff > 0)){
                preDiff = curDiff;
                result++;
            }

        }

        return result;
    }
}
