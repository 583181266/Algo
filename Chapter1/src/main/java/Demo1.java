import org.junit.Test;

/**
 * 除法用减法
 */
public class Demo1 {
   // @Test
    public void Test1(){
        int a = Integer.MIN_VALUE;
        int b = -10;
        int ans = divide(a, b);
        System.out.println(ans);

    }
    public int divide(int dividend, int divisor){
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int ans = 0;
        int flag = 0;
        if (dividend > 0){
            dividend = -dividend;
            flag++;
        }
        if (divisor > 0) {
            divisor = -divisor;
            flag++;
        }

        while (dividend <= divisor) {
            int value = divisor;
            int quotient = 1;
            while (dividend >= 0xc0000000 && dividend <= value + value ){
                quotient += quotient;
                value += value;

            }
            ans += quotient;
            dividend -= value;
        }
        return flag == 1 ? -ans : ans;

    }

    @Test
    public void Test2(){
        int x = -1000000;
        int y = -1;
        int ans = divide1(x,y);
        System.out.println(ans);
    }

    /**
     *
     * @param x 被除数
     * @param y 除数
     * @return
     */
    private int divide1(int x, int y) {
        if (x == Integer.MIN_VALUE && y == -1){
            return Integer.MAX_VALUE;
        }
        int flag = 0;
        if (x > 0){
            x = -x;
            flag++;
        }
        if (y > 0){
            y = -y;
            flag++;
        }
        int r = 0;
        while (x < y){
            int z = 1;
            int d = y;
            while (x >= 0xc0000000 && x <= d + d){
                d+=d;
                z+=z;
            }
            x-=d;
            r+=z;

        }
        return flag == 1 ? -r : r;

    }
}
