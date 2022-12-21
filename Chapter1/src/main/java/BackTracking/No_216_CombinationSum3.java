package BackTracking;

/**
 * @author huangbentai
 * @date 2022/12/16 12:59
 */

import java.util.ArrayList;
import java.util.List;

/**
 * 找出所有相加之和为 n 的 k 个数的组合，且满足下列条件：
 * <p>
 * 只使用数字1到9
 * 每个数字 最多使用一次 
 * 返回 所有可能的有效组合的列表 。该列表不能包含相同的组合两次，组合可以以任何顺序返回。
 */
public class No_216_CombinationSum3 {

    public static List<Integer> path = new ArrayList<>();
    public static List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {

        int n = 9;
        int k = 3;

        System.out.println(combinationSum3(k, n));

    }

    public static List<List<Integer>> combinationSum3(int k, int n) {

        backTracking(n,k,0,1);

        return result;


    }

    /**
     *
     * @param target 目标值
     * @param k 元素个数
     * @param sum 阶段sum
     * @param starIndex 起始值
     */
    public static void backTracking(int target, int k, int sum, int starIndex) {
        // 递归退出条件
        if (sum > target){
            return;
        }
        if (path.size() == k){
            if (sum == target){
                result.add(new ArrayList<>(path));
            }
            return;
        }

        // 横向搜索
        for (int i = starIndex; i <= 9 - (k - path.size()) + 1; i++) {

            path.add(i);
            sum+=i;


            backTracking(target,k,sum,i + 1);
            sum-=i;
            path.remove(path.size() - 1);
        }


    }
}
