package HashAlgo;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 *
 * 示例 1: 输入: s = "anagram", t = "nagaram" 输出: true
 *
 * 示例 2: 输入: s = "rat", t = "car" 输出: false
 *
 * 说明: 你可以假设字符串只包含小写字母。
 */
public class No_242_ValidAnagram {
    public static void main(String[] args) {
        String s = "rata";
        String t = "tar";
        System.out.println(isAnagram(s, t));

    }
    public static boolean isAnagram(String s, String t) {
        int[] hash = new int[26];
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        for (int i = 0; i < charS.length; i++) {
            hash[charS[i] - 'a']++;
        }
        for (int i = 0; i < charT.length; i++) {
            hash[charT[i] - 'a']--;
        }
        for (int i = 0; i < hash.length; i++) {
            if (hash[i] != 0){
                return false;
            }
        }

        return true;

    }
}
