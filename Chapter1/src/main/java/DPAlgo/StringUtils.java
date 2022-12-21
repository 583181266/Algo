package DPAlgo;

/**
 * @author huangbentai
 * @date 2022/12/16 16:23
 */
public class StringUtils {
    public static void printDp2(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void printDp1(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
