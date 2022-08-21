package HashAlgo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

//题意：给定两个数组，编写一个函数来计算它们的交集。
public class No_349_IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,1,1,1};
        int[] num2 = {1,3,3,4,6,77,};
        int[] intersection = intersection(num1, num2);
        System.out.println(Arrays.toString(intersection));

    }
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> result = new HashSet<>();
        int[] hash = new int[1002];
        for (int i = 0; i < nums1.length; i++) {
            hash[nums1[i]] = 1;
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hash[nums2[i]] == 1){
                result.add(nums2[i]);
            }
        }

        int[] ints = result.stream().mapToInt(Integer::valueOf).toArray();

        return ints;



    }

    public static int[] intersection2(int[] nums1, int[] nums2) {
        int[] result = new int[1002];
        int[] hash1 = new int[1002];
        int[] hash2 = new int[1002];
        int k = 0;
        for (int i = 0; i < nums1.length; i++) {
            hash1[nums1[i]] = 1;
        }
        for (int i = 0; i < nums2.length; i++) {
            hash2[nums2[i]] = 1;
        }
        for (int i = 0; i < hash1.length; i++) {
            if (hash1[i] == 1 && hash2[i] == 1){
                result[k] = i;
                k++;
            }
        }
        int[] r = new int[k];
        for (int i = 0; i < r.length; i++) {
            r[i] = result[i];
        }


        return r;



    }
}
