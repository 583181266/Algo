/**
 * @author huangbentai
 * @date 2022/12/16 16:23
 */
public class StringUtils {
    public static void printDp2(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}
