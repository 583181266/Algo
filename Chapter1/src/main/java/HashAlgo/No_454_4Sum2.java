package HashAlgo;

import java.util.HashMap;

/**
 * 给定四个包含整数的数组列表 A , B , C , D ,计算有多少个元组 (i, j, k, l) ，使得 A[i] + B[j] + C[k] + D[l] = 0。
 * <p>
 * 为了使问题简单化，所有的 A, B, C, D 具有相同的长度 N，且 0 ≤ N ≤ 500 。所有整数的范围在 -2^28 到 2^28 - 1 之间，最终结果不会超过 2^31 - 1 。
 */
public class No_454_4Sum2 {
    public static void main(String[] args) {
        int[] A = {1, 2};
        int[] B = {-2, -1};
        int[] C = {-1, 2};
        int[] D = {0, 2};

        System.out.println(fourSumCount(A, B, C, D));

    }

    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i : nums1) {
            for (int i1 : nums2) {
                map.put((i + i1),map.getOrDefault((i + i1),0) + 1);
            }

        }
        for (int i : nums3) {
            for (int i1 : nums4) {
                if (map.containsKey(0 - (i + i1))) {
                    count += map.get(0 - (i + i1));

                }
            }
        }



        return count;

    }
}
