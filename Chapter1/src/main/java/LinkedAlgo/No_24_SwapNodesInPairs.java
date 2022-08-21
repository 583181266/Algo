package LinkedAlgo;

import domain.ListNode;

/**
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class No_24_SwapNodesInPairs {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode now = null;
        now = head;
        now.next = new ListNode(2);
        now = now.next;
        now.next = new ListNode(3);
        now = now.next;
        now.next = new ListNode(4);
        now = now.next;
        now.next = new ListNode(5);
        now = now.next;
        now.next = new ListNode(6);
        now = now.next;
        now.next = new ListNode(7);
        ListNode listNode = swapPairs(head);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode();
        dummyHead.next = head;


        ListNode cru = dummyHead;
        while (cru.next != null && cru.next.next != null){
            ListNode temp = cru.next;
            ListNode temp1 = cru.next.next.next;
            cru.next = cru.next.next;
            cru.next.next = temp;
            temp.next = temp1;
            cru=cru.next.next;
        }

        return dummyHead.next;
    }
}
