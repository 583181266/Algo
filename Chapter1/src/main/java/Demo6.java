public class Demo6 {
    /**
     * 给你一个字符串s和一个字符规律p，请你来实现一个支持 '.'和'*'的正则表达式匹配。
     *
     * '.' 匹配任意单个字符
     * '*' 匹配零个或多个前面的那一个元素
     * 所谓匹配，是要涵盖整个字符串s的，而不是部分字符串。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode.cn/problems/regular-expression-matching
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     * @param args
     */
    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
        System.out.println(isMatch(s, p));

    }

    public static boolean isMatch(String s, String p) {
        if (p.equals(".*")){
            return true;
        }
        char[] charsS = s.toCharArray();
        char[] charsP = p.toCharArray();
        int i = 0;
        int j = 0;
        while (i < charsS.length && j <charsP.length){
            if (charsP[j] == '.'){
                i++;
                j++;
                continue;
            }
            if (charsP[j] == '*'){
                if (charsS[i] == charsP[j - 1]){
                    i++;
                    continue;
                }else {
                    return false;
                }
            }
            if (charsS[i] == charsP[j]){
                i++;
                j++;
                continue;
            }else {
                return false;
            }
        }
        if (i != charsS.length && j != charsP.length){
            return false;

        }else {
            return true;
        }


    }
}
