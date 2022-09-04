package TreeAlgo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 给定一个 N 叉树，返回其节点值的层序遍历。（即从左到右，逐层遍历）。
 *
 * 树的序列化输入是用层序遍历，每组子节点都由 null 值分隔（参见示例）。
 */
public class No_429_NaryTreeLevelOrderTraversal {
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

        System.out.println(levelOrder(root));


    }
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            List<Integer> resItem = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node poll = queue.poll();
                resItem.add(poll.val);
                List<Node> children = poll.children;
                if (children != null){
                    for (Node child : children) {
                        queue.add(child);
                    }
                }
            }
            result.add(resItem);
        }

        return result;
    }
}
