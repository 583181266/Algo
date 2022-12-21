/**
 * @author huangbentai
 * @date 2022/9/21 19:59
 */
public class Demo12 {
    public static void main(String[] args) {
        int[] records = {1,1,1,1,1,1,1,1,3,3,8,7,10,15,20};
        int total = 10;

        int ans =  solve(records, total);
        System.out.println(ans);
    }

    private static int solve(int[] records, int total) {
        int result = 0;
        int sum = 0;
        // 在哪里溢出
        int location = 0;
        int max = 0;
        for (int i = 0; i < records.length; i++) {
            sum += records[i];
            if (sum > total) {
                location = i;
                max = records[i];
                break;
            }
        }
        if (sum < total){
            return -1;
        }

        //二分求和 result 0-max sum < total
        int left = 0;
        while (left < max){

            result = (max + left) / 2;
            Long temp = sumTotal(records,result,location);
            if (temp > total){
                max = result;
            }else {
                int t = result + 1;
                if (sumTotal(records,t,location) > total){
                    break;
                }
                left = result;
            }
        }
        return result;





    }

    private static Long sumTotal(int[] records, int result, int location) {
        Long ans = 0L;
        for (int i = 0; i <= location; i++) {
            if (records[i] < result){
                ans += records[i];
            }else {
                ans += result;
            }
        }
        int x = records.length + 1 - location;
        int temp = x * result;
        return ans += temp;

    }

}
