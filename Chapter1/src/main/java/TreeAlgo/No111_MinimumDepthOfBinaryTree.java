package TreeAlgo;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author huangbentai
 * @date 2022/12/7 22:15
 */
public class No111_MinimumDepthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(No_102_BinaryTreeLevelOrderTraversal.levelOrder(root));
        System.out.println(minDepth(root));

    }

    public static int minDepth(TreeNode root) {
        int result = 0;
        if (root == null){
            return result;
        }
        // 层序遍历
        Queue<TreeNode> queue = new LinkedBlockingQueue<>();
        queue.add(root);

        while (!queue.isEmpty()){
            int size = queue.size();
            result++;
            for (int i = 0; i < size; i++) {
                TreeNode poll = queue.poll();
                if (poll.left != null){
                    queue.add(poll.left);
                }
                if (poll.right != null){
                    queue.add(poll.right);
                }

                // 判断该节点是否是左右节点都为空的子叶节点
                if (poll.left == null && poll.right == null){
                    return result;
                }
            }
        }
        return result;

    }
}
