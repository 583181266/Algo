package TreeAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 给你一棵二叉树的根节点 root ，返回其节点值的 后序遍历 。
 *
 * 左右中
 *
 * 中左右
 * 中右左
 *
 */
public class No_145_BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(root));
        System.out.println(postorderTraversal2(root));
    }

    /**
     * 后序遍历 左右中 递归法
     * @param root
     * @return
     */
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postorder(root,result);
        return result;
    }
    public static void postorder(TreeNode root, List<Integer> result){
        if (root == null){
            return;
        }
        postorder(root.left,result);
        postorder(root.right,result);
        result.add(root.val);
    }

    /**
     * 后序遍历 迭代法
     */
    public static List<Integer> postorderTraversal2(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return result;
        }

        stack.push(root);
        while (!stack.empty()){
            TreeNode pop = stack.pop();
            result.add(pop.val);
            if (pop.left != null){
                stack.push(pop.left);
            }
            if (pop.right != null){
                stack.push(pop.right);
            }
        }
        Collections.reverse(result);


        return result;
    }
}
