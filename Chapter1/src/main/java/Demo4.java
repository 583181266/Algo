public class Demo4 {
    public static void main(String[] args) {
        String s = "- 42546 dfsagadasdga";
        int i = myAtoi(s);
        System.out.println(i);
    }

    public static int myAtoi(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int n = chars.length;
        boolean flag = true;
        while (i < n && chars[i] == ' '){
            i++;
        }
        if (i == n){
            return 0;
        }
        if (chars[i] == '-'){
            flag = false;
            i++;
        }else if (chars[i] == '+'){
            i++;
        } else if (!Character.isDigit(chars[i])) {
            return 0;
        }
        int ans = 0;
        while (i < n && Character.isDigit(chars[i])){
            int digit = chars[i] - '0';
            if (ans  > (Integer.MAX_VALUE - digit)/10){
                return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            ans = ans * 10 + digit;
            i++;
        }

        return flag?ans:-ans;

    }
}
