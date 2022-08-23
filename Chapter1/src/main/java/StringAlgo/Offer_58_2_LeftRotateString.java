package StringAlgo;

/**
 * 字符串的左旋转操作是把字符串前面的若干个字符转移到字符串的尾部。请定义一个函数实现字符串左旋转操作的功能。比如，输入字符串"abcdefg"和数字2，该函数将返回左旋转两位得到的结果"cdefgab"。
 *
 * 示例 1：
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 *
 * 示例 2：
 * 输入: s = "lrloseumgh", k = 6
 * 输出: "umghlrlose"
 *
 * 限制：
 * 1 <= k < s.length <= 10000
 */
public class Offer_58_2_LeftRotateString {
    public static void main(String[] args) {
        String s = "lrloseumgh";
        int k = 6;
        System.out.println(reverseLeftWords(s, k));

    }
    public static String reverseLeftWords(String s, int n) {
        char[] chars = s.toCharArray();
        reverseChar(chars,0,n - 1);
        reverseChar(chars,n,chars.length - 1);
        reverseChar(chars,0,chars.length - 1);

        return new String(chars);


    }
    public static void reverseChar(char[] s, int begin, int end){
        while (begin < end){
            s[begin] = (char) (s[begin] ^ s[end]);
            s[end] = (char) (s[begin] ^ s[end]);
            s[begin] = (char) (s[begin] ^ s[end]);
            begin++;
            end--;
        }
    }
}
