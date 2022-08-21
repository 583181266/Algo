package ArrayAlgo;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int target = 8;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        while (left < right){
            int middle = (left + right) / 2;
            if (nums[middle] > target){
                right = middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
