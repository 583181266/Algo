package tanxin;

/**
 * @author huangbentai
 * @date 2022/11/25 15:02
 */
public class No122BestTimeToBuyAndStock2 {
    public static void main(String[] args) {
        int[] price = {7,1,5,3,6,4};
        System.out.println(maxProfit(price));
    }

    public static int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length - 1; i++) {

            if (prices[i + 1] - prices[i] > 0){
                ans += (prices[i + 1] - prices[i]);
            }
        }

        return ans;

    }
}
