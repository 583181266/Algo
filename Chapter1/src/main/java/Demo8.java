import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Demo8 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2,3,3,3,3,4,5,5,6,124,124};
        Arrays.sort(nums);
        int k = removeDuplicates2(nums);
        for (int i = 0; i < k; i++) {
            System.out.println(nums[i]);
        }

    }
    public static int removeDuplicates(int[] nums) {
        HashSet<Integer> numsSet = new HashSet<>();
        int slow = 0;
        for (int fast = 0; fast < nums.length; fast++) {
            if (!numsSet.contains(nums[fast])){
               nums[slow] = nums[fast];
               slow++;
            }
            numsSet.add(nums[fast]);
        }
        return slow;

    }
    public static int removeDuplicates2(int[] nums) {
        int slow = 0;
        for (int fast = 1; fast < nums.length; fast++) {
            if(nums[fast] != nums[slow]){
                nums[slow + 1] = nums[fast];
                slow++;
            }
        }
        return slow + 1;

    }
}
