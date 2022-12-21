package tanxin;

/**
 * @author huangbentai
 * @date 2022/11/25 16:01
 */
public class No55JumpGame {
    public static void main(String[] args) {
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }

    public static boolean canJump(int[] nums) {
        int cover = 0;
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(i + nums[i],cover);
            if (cover >= nums.length - 1){
                return true;
            }
        }
        return false;
    }
}
