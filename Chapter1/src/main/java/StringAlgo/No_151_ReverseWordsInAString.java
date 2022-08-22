package StringAlgo;

/**
 * 给定一个字符串，逐个翻转字符串中的每个单词。
 * <p>
 * 示例 1：
 * 输入: "the sky is blue"
 * 输出: "blue is sky the"
 * <p>
 * 示例 2：
 * 输入: "  hello world!  "
 * 输出: "world! hello"
 * 解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
 * <p>
 * 示例 3：
 * 输入: "a good   example"
 * 输出: "example good a"
 * 解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 * <p>
 * #
 */
public class No_151_ReverseWordsInAString {
    public static void main(String[] args) {
        String s = " the sky is blue   ";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        char[] chars = s.toCharArray();
        reverseChar(chars, 0, chars.length - 1);
        int slow = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == ' ') {
                continue;
            }
            //反转每一个单词
            int begin = i;
            while (i < chars.length && chars[i] != ' ') {
                i++;
            }
            reverseChar(chars, begin, i - 1);
            if (slow != 0){
                chars[slow] = ' ';
                slow++;
            }

            for (int j = begin; j < i; j++) {
                chars[slow] = chars[j];
                slow++;
            }


        }



        return new String(chars,0,slow);
    }

    public static void reverseChar(char[] s, int begin, int end) {
        while (begin < end) {
            s[begin] = (char) (s[begin] ^ s[end]);
            s[end] = (char) (s[begin] ^ s[end]);
            s[begin] = (char) (s[begin] ^ s[end]);
            begin++;
            end--;
        }
    }
}
