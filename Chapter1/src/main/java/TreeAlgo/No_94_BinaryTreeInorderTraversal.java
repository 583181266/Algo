package TreeAlgo;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
 * 左中右
 */
public class No_94_BinaryTreeInorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(inorderTraversal(root));
        System.out.println(inorderTraversal2(root));
        System.out.println(inorderTraversal3(root));

    }

    /**
     * 中序遍历递归法
     */
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorder(root,result);


        return result;
    }
    /**
     * 中序遍历递归法
     */
    public static void inorder(TreeNode root, List<Integer> result){
        //递归结束条件
        if(root == null){
            return;
        }

        inorder(root.left,result);
        result.add(root.val);
        inorder(root.right,result);




    }

    /**
     * 中序遍历迭代法  左中右
     */
    public static List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null){
            return result;
        }
        TreeNode cru = root;
        while (!stack.empty() || cru != null){
            if (cru != null){
                stack.push(cru);
                cru = cru.left;
            }else {
                cru = stack.pop();
                result.add(cru.val);
                cru = cru.right;
            }

        }
        return result;

    }

    /**
     * 中序遍历迭代法 左中右  左右
     *
     */
    public static List<Integer> inorderTraversal3(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null){
            return result;
        }

        TreeNode cru = root;
        while (!stack.empty() || cru != null){
            if (cru != null){
                stack.push(cru);
                cru = cru.left;
            }else {
                cru = stack.pop();
                result.add(cru.val);
                cru = cru.right;
            }


        }


        return result;
    }


}
