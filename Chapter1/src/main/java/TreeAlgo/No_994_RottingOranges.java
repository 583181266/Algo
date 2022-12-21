package TreeAlgo;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author huangbentai
 * @date 2022/12/15 22:02
 */
public class No_994_RottingOranges {
    public static void main(String[] args) {
        int[][] grid = {
                {2,1,1},
                {1,1,0},
                {0,1,1}
        };

        System.out.println(orangesRotting(grid));

    }

    public static int orangesRotting(int[][] grid) {
        int result = 0;
        Queue<int[]> queue = new LinkedBlockingQueue<>();
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2){
                    queue.add(new int[]{i, j});
                }
                if (grid[i][j] == 1){
                    count++;
                }
            }
        }

        // 分钟
        int minute = 0;
        while (count > 0 && !queue.isEmpty()){
            minute++;
            int n = queue.size();
            for (int i = 0; i < n; i++) {
                int[] poll = queue.poll();
                int x = poll[0];
                int y = poll[1];

                if (x - 1 >= 0 && grid[x - 1][y] == 1){
                    grid[x - 1][y] = 2;
                    count--;
                    queue.add(new int[]{x - 1, y});
                }
                if (x + 1 <= grid.length - 1 && grid[x + 1][y] == 1){
                    grid[x + 1][y] = 2;
                    count--;
                    queue.add(new int[]{x + 1, y});
                }
                if (y - 1 >= 0 && grid[x][y - 1] == 1){
                    grid[x][y - 1] = 2;
                    count--;
                    queue.add(new int[]{x, y - 1});
                }
                if (y + 1 <= grid[0].length - 1 && grid[x][y + 1] == 1){
                    grid[x][y + 1] = 2;
                    count--;
                    queue.add(new int[]{x, y + 1});
                }

            }

        }
        if (count > 0){
            return -1;
        }

        return minute;

    }
}
