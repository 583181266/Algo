package StringAlgo;

import java.util.Arrays;

/**
 * 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
 *
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 *
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 *
 * 示例:
 *
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 */
public class No_541_ReverseString2 {
    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
    public static String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i+=(2 * k)) {
            if (i + k <= chars.length){
                int left = i;
                int right = i + k - 1;
                while (left < right){
                    chars[left] = (char) (chars[left] ^ chars[right]);
                    chars[right] = (char) (chars[left] ^ chars[right]);
                    chars[left] = (char) (chars[left] ^ chars[right]);
                    left++;
                    right--;
                }
                continue;
            }
            int left = i;
            int right = chars.length - 1;
            while (left < right){
                chars[left] = (char) (chars[left] ^ chars[right]);
                chars[right] = (char) (chars[left] ^ chars[right]);
                chars[left] = (char) (chars[left] ^ chars[right]);
                left++;
                right--;
            }

        }
        return new String(chars);

    }

}
