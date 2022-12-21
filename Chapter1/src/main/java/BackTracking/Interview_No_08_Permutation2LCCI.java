package BackTracking;

/**
 * @author huangbentai
 * @date 2022/12/15 01:15
 */

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 有重复字符串的排列组合。编写一种方法，计算某字符串的所有排列组合。
 */
public class Interview_No_08_Permutation2LCCI {



    public static void main(String[] args) {
        String s = "qqq";
        String[] permutation = permutation(s);
        System.out.println(Arrays.toString(permutation));

    }

    public static ArrayList<String> result = new ArrayList<>();
    public static ArrayList<Character> path = new ArrayList<>();


    public static String[] permutation(String s) {
        char[] chars = s.toCharArray();
        boolean[] used = new boolean[chars.length];
        for (int i = 0; i < used.length; i++) {
            used[i] = false;
        }


        backTracking(chars,used);


        return result.toArray(new String[result.size()]);
    }

    public static void backTracking(char[] chars, boolean[] used){
        // 递归终止条件
        if (path.size() == chars.length){
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < path.size(); i++) {
                sb.append(path.get(i));
            }
            result.add(sb.toString());
            System.out.println(sb.toString());

            return;
        }

        // 横向搜索
        for (int i = 0; i < chars.length; i++) {

            // 同层剪枝
            if(i > 0 && chars[i] == chars[i -1] && !used[i - 1]){
                continue;
            }


            if(!used[i]){
                path.add(chars[i]);
                used[i] = true;
                backTracking(chars,used);

                used[i] = false;
                path.remove(path.size() - 1);
            }


        }

    }
}


