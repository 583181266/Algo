package BackTracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author huangbentai
 * @date 2022/12/15 00:48
 */
public class No_77_Combinations {
    public static void main(String[] args) {
        combine(4, 2);
        for (List<Integer> integers : result) {
            for (Integer integer : integers) {
                System.out.println(integer);
            }
        }

    }

    public static List<List<Integer>> result = new ArrayList<>();
    public static List<Integer> path = new ArrayList<>();

    public static List<List<Integer>> combine(int n, int k) {
         List<List<Integer>> result = new ArrayList<>();
         backtracking(n,k,1);

         return result;


    }

    static void backtracking(int n, int k, int starIndex){
        // 递归终止条件
        if (path.size() == k){
            System.out.println("!");
            List<Integer> ans = new ArrayList<>(path);

            result.add(ans);
            return;
        }

        // 横向搜索
        for (int i = starIndex; i <= n - (k - path.size()) + 1; i++){
            path.add(i);
            backtracking(n,k,i + 1);

            // 回溯
            path.remove(path.size() - 1);
        }



    }

}
