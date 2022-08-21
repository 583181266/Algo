package LinkedAlgo;

import domain.ListNode;

public class No_206_ReverseLinkedList {
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

        ListNode listNode = reverseList2(head);
        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
    public static ListNode reverseList(ListNode head) {
        ListNode cru = head;
        ListNode pre = null;
        ListNode temp = null;
        while (cru != null){
            temp = cru.next;
            cru.next = pre;
            pre = cru;
            cru = temp;
        }
        return pre;
    }
    public static ListNode reverseList2(ListNode head) {
        return reverse(head,null);

    }
    public static ListNode reverse(ListNode cru, ListNode pre){
        if (cru == null){
            return pre;
        }
        ListNode temp = cru.next;
        cru.next = pre;
        return reverse(temp,cru);


    }
}
