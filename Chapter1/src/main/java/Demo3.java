import java.util.Arrays;
import java.util.HashMap;

public class Demo3 {
    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int target = 6;
        int[] add = add(nums,target);
        System.out.println(Arrays.toString(add));
    }
    public static int[] add(int[] nums,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] ans = {0,0};
        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];
            if(map.containsKey(need)){
                ans[0] = i;
                ans[1] = map.get(need);
                break;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}
