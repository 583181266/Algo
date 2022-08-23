package StringAlgo;

import java.util.Arrays;

/**
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 *
 * 示例 1:
 * 输入: "abab"
 * 输出: True
 * 解释: 可由子字符串 "ab" 重复两次构成。
 *
 * 示例 2:
 * 输入: "aba"
 * 输出: False
 *
 * 示例 3:
 * 输入: "abcabcabcabc"
 * 输出: True
 * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 */
public class No_459_RepeatedSubStringPattern {
    public static void main(String[] args) {
        String s = "aababaabb";
        System.out.println(repeatedSubstringPattern(s));
    }
    public static boolean repeatedSubstringPattern(String s) {

        char[] chars = s.toCharArray();
        int len = chars.length;
        int[] next = new int[len];
        int j = 0; //最长的相同前后缀的长度
        for (int i = 1; i < len; i++) {
            while (j > 0 && chars[i] != chars[j]){
                j = next[j - 1];
            }
            if (chars[i] == chars[j]){
                j++;
            }
            next[i] = j;
        }
        System.out.println(Arrays.toString(next));
        if(next[len -1] != 0 && len % (len - next[len -1]) == 0){
            return true;
        }

        return false;

    }
}
