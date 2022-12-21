package TreeAlgo;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */
public class No_104_MaximumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(maxDepth2(root));
    }

    /**
     * 迭代法
     * @param root
     * @return
     */
    public static int maxDepth(TreeNode root) {
        int deep = 0;
        if (root == null){
            return deep;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            deep++;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null){
                    queue.add(poll.left);
                }
                if (poll.right != null){
                    queue.add(poll.right);
                }
            }


        }

        return deep;
    }

    /*
    递归法
     */
    public static int maxDepth2(TreeNode root) {
        // 退出递归条件
        if (root == null){
            return 0;
        }
        // 单层逻辑
        int left = maxDepth2(root.left);
        int right = maxDepth2(root.right);
        // 当前的深度
        int deep = Math.max(left,right) + 1;

        return deep;




    }


}
