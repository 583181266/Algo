package TreeAlgo;

import java.util.*;

/**
 * 给定一个非空二叉树的根节点 root , 以数组的形式返回每一层节点的平均值。与实际答案相差 10-5 以内的答案可以被接受。
 */
public class No_637_AverageOfLevelsInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(20);
        root.left = new TreeNode(9);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(averageOfLevels(root));
    }
    public static List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> resLevel = new ArrayList<>();
            double size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                resLevel.add(poll.val);
                if (poll.left != null){
                    queue.add(poll.left);
                }
                if (poll.right != null){
                    queue.add(poll.right);
                }
            }
            double sum = 0;
            for (Integer integer : resLevel) {
                sum += integer;
            }

            result.add(Double.valueOf(sum / size));
        }


        return result;
    }
}
