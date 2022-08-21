public class Demo5 {
    public static void main(String[] args) {
        int x = 0;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String s = String.valueOf(x);
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i <= j){
            if (chars[i] == chars[j]){
                i++;
                j--;
                continue;
            }else {
                return false;
            }
        }
        return true;

    }
}
