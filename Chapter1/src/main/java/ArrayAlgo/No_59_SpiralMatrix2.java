package ArrayAlgo;

import java.util.Arrays;

/**
 * 给定一个正整数 n，生成一个包含 1 到 n^2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 *
 * 示例:
 *
 * 输入: 3 输出: [ [ 1, 2, 3 ], [ 8, 9, 4 ], [ 7, 6, 5 ] ]
 */
public class No_59_SpiralMatrix2 {
    public static void main(String[] args) {
        int n = 9;
        int[][] ints = generateMatrix(n);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }

    }
    public static int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        int startX = 0;
        int startY = 0;
        int offset = 1;
        int count = 1;
        int i = 0;
        int j = 0;
        int size = n;
        while ((size / 2) > 0){
            for (j = startY; j < n - offset; j++) {
                result[startX][j] = count++;
            }
            for (i = startX; i < n - offset; i++) {
                result[i][j] = count++;
            }
            for (; j > startY; j--){
                result[i][j] = count++;
            }
            for (; i > startX; i--){
                result[i][j] = count++;
            }
            startX++;
            startY++;
            offset++;
            size--;
        }
        if(n % 2 == 1){
            result[n / 2][n / 2] = count;
        }
        return result;

    }
}
