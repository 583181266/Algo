package LinkedAlgo;

import domain.ListNode;

/**
 * 题意：删除链表中等于给定值 val 的所有节点。
 */
public class No_203_RemoveLinkedListElement {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode now = null;
        now = head;
        now.next = new ListNode(2);
        now = now.next;
        now.next = new ListNode(6);
        now = now.next;
        now.next = new ListNode(3);
        now = now.next;
        now.next = new ListNode(4);
        now = now.next;
        now.next = new ListNode(5);
        now = now.next;
        now.next = new ListNode(6);
        int val = 6;
        ListNode listNode = removeElements(head, 6);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
    public static ListNode removeElements(ListNode head, int val) {

        while (head != null && head.val == val){
            head = head.next;
        }
        if (head == null){
            return head;
        }
        ListNode cru = head;
        while (cru != null){
            if (cru.next != null && cru.next.val == val){
                cru.next = cru.next.next;
            }else {
                cru = cru.next;
            }

        }

        return head;
    }

    public static ListNode removeElements2(ListNode head, int val) {
        ListNode dummy = new ListNode(-1,head);
        ListNode cru = dummy;
        while (cru.next != null){
            if (cru.next.val == val){
                cru.next = cru.next.next;
            }else {
                cru = cru.next;
            }
        }

        return dummy.next;


    }
}
