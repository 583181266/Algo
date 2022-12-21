package TreeAlgo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
 *
 * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔（参见示例）。
 */
public class No_429_NaryTreeLevelPostorderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node floor1_1 = new Node(3);
        Node floor1_2 = new Node(2);
        Node floor1_3 = new Node(4);
        List<Node> children1 = new ArrayList<>();
        children1.add(floor1_1);
        children1.add(floor1_2);
        children1.add(floor1_3);
        root.children = children1;
        Node floor2_1 = new Node(5);
        Node floor2_2 = new Node(6);
        List<Node> children2 = new ArrayList<>();
        children2.add(floor2_1);
        children2.add(floor2_2);
        floor1_1.children = children2;

        System.out.println(postorder(root));


    }
    /**
     * @author huangbentai
     * @date 2022/12/7 21:35
     */
    public static List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()){
            Node pop = stack.pop();
            List<Node> children = pop.children;
            if (children != null){
                children.forEach(stack::push);
            }

            result.add(pop.val);

        }
        Collections.reverse(result);
        return result;
    }


}
