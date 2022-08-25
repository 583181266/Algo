package StackAndQueueAlgo;

import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 */
public class No_20_ValidParentheses {
    public static void main(String[] args) {
        String s = "){";
        System.out.println(isValid(s));

    }
    public static boolean isValid(String s) {
        if (s == null){
            return true;
        }
        if (s.length() % 2 != 0){
            return false;
        }
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '('){
                stack.push(')');
            } else if (chars[i] == '{'){
                stack.push('}');
            } else if (chars[i] == '['){
                stack.push(']');
            } else if (stack.empty() || stack.peek() != chars[i]){
                return false;
            }else {
                stack.pop();
            }
        }

        return stack.empty();
    }

}
