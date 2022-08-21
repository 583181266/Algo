import org.junit.Test;

/**
 * 字符串做二进制加法
 */

public class Demo2 {
    @Test
    public void test(){
        String a = "1011111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
        String b = "111111111111111111111111111111";
        String ans = add(a, b);
        System.out.println(ans);

    }
    public String add(String a, String b){
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        while (i >= 0 || j >= 0){
            int x = i >= 0 ? a.charAt(i--) - '0' : 0;
            int y = j >= 0 ? b.charAt(j--) - '0' : 0;
            int sum = x + y + carry;
            carry = sum >= 2 ? 1 : 0;
            sum = sum >= 2 ? sum - 2 : sum;
            sb.append(sum);



        }
        if (carry == 1){
            sb.append(1);
        }




        return sb.reverse().toString();
    }
}
