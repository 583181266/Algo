package StackAndQueueAlgo;

import java.util.Stack;

/**
 * 给出由小写字母组成的字符串 S，重复项删除操作会选择两个相邻且相同的字母，并删除它们。
 *
 * 在 S 上反复执行重复项删除操作，直到无法继续删除。
 *
 * 在完成所有重复项删除操作后返回最终的字符串。答案保证唯一。
 *
 * 示例：
 *
 * 输入："abbaca"
 * 输出："ca"
 * 解释：例如，在 "abbaca" 中，我们可以删除 "bb" 由于两字母相邻且相同，这是此时唯一可以执行删除操作的重复项。之后我们得到字符串 "aaca"，其中又只有 "aa" 可以执行重复项删除操作，所以最后的字符串为 "ca"。
 */
public class No_1047_RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        String s = "abbaca";
        System.out.println(removeDuplicates(s));
        System.out.println(rD(s));
    }
    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();

        for (char c : chars) {
            if (stack.empty() || c != stack.peek()){
                stack.push(c);
            }else if (c == stack.peek()) {
                stack.pop();
            }
        }
        int size = stack.size();
        char[] r = new char[size];
        for (int i = r.length - 1; i >= 0; i--) {
            r[i] = stack.pop();
        }

        return new String(r,0,size);
    }

    //双指针
    public static String rD(String s){
        char[] chars = s.toCharArray();
        int slow = 0;
        for (int i = 0; i < chars.length; i++) {
            chars[slow] = chars[i];
            if (slow > 0 && chars[slow] == chars[slow - 1]){
                slow--;
            }else {
                slow++;
            }
        }
        return new String(chars,0,slow);
    }
}
