package TreeAlgo;

import java.util.Stack;

/**
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 */
public class No_226_InvertBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        System.out.println(No_102_BinaryTreeLevelOrderTraversal.levelOrder(root));
        TreeNode treeNode = invertTree2(root);
        System.out.println(No_102_BinaryTreeLevelOrderTraversal.levelOrder(root));

    }

    public static TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    /**
     * @author huangbentai
     * @date 2022/12/7 21:05
     */
    public static TreeNode invertTree2(TreeNode root){
        if (root == null) {
            return null;
        }
        // 需要栈来进行处理
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.empty()){
            TreeNode pop = stack.pop();
            if (pop.right != null){
                stack.push(pop.right);
            }
            if (pop.left != null){
                stack.push(pop.left);
            }
            TreeNode temp = pop.left;
            pop.left = pop.right;
            pop.right = temp;
        }

        return root;
    }

}
