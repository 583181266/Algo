package TreeAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 * 根，左，右
 */
public class No_144_BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(root));
        System.out.println(preorderTraversal2(root));
    }
    /**
     * 前序遍历递归法
     *
     */
    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorder(root,result);



        return result;
    }

    /**
     * 前序遍历递归法
     * @param root
     * @param result
     */
    public static void preorder(TreeNode root, List<Integer> result){
        //终止条件 root == null
        if (root == null){
            return;
        }
        result.add(root.val);
        preorder(root.left,result);
        preorder(root.right,result);


    }

    /**
     * 前序遍历迭代法 中左右
     *
     */
    public static List<Integer> preorderTraversal2(TreeNode root){
        if (root == null){
            return new ArrayList<>();
        }
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode temp = stack.pop();
            result.add(temp.val);
            if (temp.right != null){
                stack.push(temp.right);
            }
            if (temp.left != null){
                stack.push(temp.left);
            }
        }
        return result;


    }

}
