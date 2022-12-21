package tanxin;

/**
 * @author huangbentai
 * @date 2022/11/25 00:18
 */
public class No53MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int count = 0;
        int result = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            count += nums[i];
            if (count > result){
                result = count;
            }
            if (count < 0){
                count = 0;
            }
        }
        return result;

    }
}
