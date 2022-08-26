/**
 * 创建一个二维数组，arr[10] [2] ,每个元素中存放的数据是他的角标 之和，例arr[0] [0] = 0.
 *   要求输出arr[9] [1]的值
 */
public class Demo9 {
    public static void main(String[] args) {
        int[][] arr = new int[10][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = i + j;
            }
        }
        System.out.println(arr[9][1]);
    }
}
