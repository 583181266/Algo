package HashAlgo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复的三元组。
 * <p>
 * 注意： 答案中不可以包含重复的三元组。
 * <p>
 * 示例：
 * <p>
 * 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
 * <p>
 * 满足要求的三元组集合为： [ [-1, 0, 1], [-1, -1, 2] ]
 */
public class No_15_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> lists = threeSum(nums);
        for (List<Integer> list : lists) {
            System.out.println(list);
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        if (nums[0] > 0){
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i - 1] == nums[i]){
                continue;
            }
            int left = i + 1;
            int right = nums.length - 1;
            while (right > left){
                if (nums[i] + nums[left] + nums[right] > 0){
                    right--;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                }else {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    result.add(temp);
                    right--;
                    left++;
                    while (right > left && nums[right] == nums[right + 1]){
                        right--;
                    }
                    while (right > left && nums[left] == nums[left - 1]){
                        left++;
                    }
                }

            }
        }
        
        
        return result;

    }
}
