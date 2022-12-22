package StringAlgo;

/**
 * @author huangbentai
 * @date 2022/12/22 00:42
 */

import java.util.Stack;

/**
 * 给定一个字符串描述的算术表达式，计算出结果值。
 * <p>
 * 输入字符串长度不超过 100 ，合法的字符包括 ”+, -, *, /, (, )” ， ”0-9” 。
 * <p>
 * 数据范围：运算过程中和最终结果均满足 |val| \le 2^{31}-1 \∣val∣≤2
 * 31
 * −1  ，即只进行整型运算，确保输入的表达式合法
 */
public class HJ_54_SolveExpressions {
    public static void main(String[] args) {
        String s = "(1+2+6*7*9*(1+(1+1)+2+3)-1)/2";
        System.out.println(solve(s));
    }

    public static int solve(String s) {
        char[] chars = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int sign = '+';
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (Character.isDigit(c)) {
                num = num * 10 + c - '0';
            }
            // 遇到括号先算括号里的
            if (c == '('){
                int l = i + 1;
                int r = l;
                int count = 1;
                while (count > 0){
                    r++;
                    if (chars[r] == ')'){
                        count--;
                    }
                    if (chars[r] == '('){
                        count++;
                    }
                }
                String substring = s.substring(l, r);
                System.out.println(substring);
                // 左闭右开
                num = solve(s.substring(l, r));
                System.out.println(num);

                i = r;
                System.out.println(chars[i]);


            }
            // 处理 + - * / 和 右括号
            if (!Character.isDigit(c) || i == chars.length - 1) {
                switch (sign) {
                    case '+':
                        stack.add(num);
                        break;
                    case '-':
                        stack.add(-1 * num);
                        break;
                    case '*':
                        stack.add(stack.pop() * num); // 乘除先算
                        break;
                    case '/':
                        stack.add(stack.pop() / num); // 乘除先算
                        break;
                }

                num = 0;
                sign = c;
                System.out.println("符号" + c);
            }
        }
        // 加和减最后算
        int ans = 0;
        for (Integer integer : stack) {
            ans+=integer;
        }
        return ans;
    }
}
