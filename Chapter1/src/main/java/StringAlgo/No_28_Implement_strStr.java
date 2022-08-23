package StringAlgo;

/**
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1: 输入: haystack = "hello", needle = "ll" 输出: 2
 *
 * 示例 2: 输入: haystack = "aaaaa", needle = "bba" 输出: -1
 *
 * 说明: 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 */

public class No_28_Implement_strStr {
    public static void main(String[] args) {
        String s = "aav";
        String needle = "av";
        System.out.println(strStr(s, needle));
    }
    public static int strStr(String haystack, String needle){
        int[] next = new int[needle.length()];
        getNext(needle,next);
        char[] chars = haystack.toCharArray();
        char[] charX = needle.toCharArray();
        int j = 0;
        for (int i = 0; i < chars.length; i++) {
            while (j > 0 && chars[i] != charX[j]){
                j = next[j - 1];
            }
            if(chars[i] == charX[j]){
                j++;
            }
            if (j == charX.length){
                return i - (charX.length)  + 1;
            }
        }
        return -1;


    }
    //afabaaaf
    public static void getNext(String needle, int[] next){
        char[] chars = needle.toCharArray();
        int j = 0;//最长的相同前后缀长度
        for (int i = 1; i < chars.length; i++) {
            while (j > 0 && chars[i] != chars[j]){
                j = next[j - 1];
            }
            if(chars[i] == chars[j]){
                j++;
            }
            next[i] = j;
        }


    }


}
