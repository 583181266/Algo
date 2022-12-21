package tanxin;

import java.util.Arrays;

/**
 * @author huangbentai
 * @date 2022/11/24 23:28
 */
public class No455AssignCookies {
    public static void main(String[] args) {
        int[] g = {1,2}; // 胃口
        int[] s = {2,3,4,5}; // 饼干
        System.out.println(findContentChildren(g, s));

    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        for (int i = 0; i < s.length; i++) {
            if (index < g.length && g[index] <= s[i]){
                index++;
            }
        }
        return index;

    }
}
