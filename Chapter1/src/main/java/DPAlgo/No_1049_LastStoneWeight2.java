package DPAlgo;

/**
 * @author huangbentai
 * @date 2022/12/22 17:33
 */

import java.util.Arrays;

/**
 * 有一堆石头，用整数数组 stones 表示。其中 stones[i] 表示第 i 块石头的重量。
 *
 * 每一回合，从中选出任意两块石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 *
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块 石头。返回此石头 最小的可能重量 。如果没有石头剩下，就返回 0。
 *
 * 来源：力扣（LeetCode）
 * 链接：<a>https://leetcode.cn/problems/last-stone-weight-ii</a>
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class No_1049_LastStoneWeight2 {
    public static void main(String[] args) {
        int[] stones = {2,7,4,1,8,1};
        System.out.println(lastStoneWeightII(stones));

    }

    public static int lastStoneWeightII(int[] stones) {
        // dp数组
        int sum = 0;
        for (int i = 0; i < stones.length; i++) {
            for (int j = 0; j < sum; j++) {

            }
        }

        // 插入排序
        for (int i = 1; i < stones.length; i++) {
            int temp = stones[i];
            int j = i - 1;
            while (j >= 0 && stones[j] > temp) {
                stones[j + 1] = stones[j];
                j--;
            }
            stones[j + 1] = temp;
        }
        System.out.println(Arrays.toString(stones));


        return 0;



    }
}
