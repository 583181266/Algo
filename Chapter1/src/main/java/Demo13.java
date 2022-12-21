import java.util.*;

/**
 * @author huangbentai
 * @date 2022/9/21 21:22
 */
public class Demo13 {
    public static void main(String[] args) {


        System.out.println(test(15, Arrays.asList(1,1,1,1,1,1,1,1,3,3,8,7,10,15,20), 40));

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();


    }
    public static int test(int n, List<Integer> list, int limit){
        Collections.sort(list);
        Map<Integer, Integer> map = new HashMap<>(n);
        int sum = 0;
        int i = 0;
        for (; i < n; i++){
            sum += list.get(i);
            map.put(i, sum);
        }
        if (map.get(n - 1) < limit){
            return  -1;
        }
        int j = n;
        while (j > 0){
            j--;
            Integer tmp = map.get(j);
            if (tmp < limit){
                int avg = (limit - tmp) / 2;
                if (avg < list.get(j+1) && avg > list.get(j)){
                    return avg;
                }
            }
        }
        return -1;
    }
}
