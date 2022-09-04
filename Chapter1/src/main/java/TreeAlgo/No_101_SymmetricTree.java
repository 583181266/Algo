package TreeAlgo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给你一个二叉树的根节点 root ， 检查它是否轴对称。
 */
public class No_101_SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        System.out.println(isSymmetric(root));
    }
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()){
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right !=null){
                return false;
            }
            if (left != null && right ==null){
                return false;
            }

            if (left == null && right == null){
                continue;
            }

            if (left != null && right != null){
                if (left.val != right.val){
                    return false;
                }else {
                    queue.add(left.left);
                    queue.add(right.right);
                    queue.add(left.right);
                    queue.add(right.left);
                }

            }
        }
        return true;

    }
}
