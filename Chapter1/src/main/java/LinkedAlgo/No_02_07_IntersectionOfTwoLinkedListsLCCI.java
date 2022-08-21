package LinkedAlgo;

import domain.ListNode;

/**
 * 给你两个单链表的头节点 headA 和 headB ，请你找出并返回两个单链表相交的起始节点。如果两个链表没有交点，返回 null 。
 */
public class No_02_07_IntersectionOfTwoLinkedListsLCCI {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        ListNode now = null;
        now = headA;
        now.next = new ListNode(2);
        now = now.next;
        now.next = new ListNode(3);
        now = now.next;
        now.next = new ListNode(4);
        now = now.next;
        now.next = new ListNode(5);
        ListNode headB = new ListNode(1);
        ListNode nowB = null;
        nowB = headB;
        nowB.next = new ListNode(2);
        nowB = nowB.next;
        headB.next.next = headA.next.next.next;
        ListNode intersectionNode = getIntersectionNode(headA, headB);
        System.out.println(intersectionNode.val);


    }
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode cruA = headA;
        ListNode cruB = headB;
        int lenA = 0;
        int lenB = 0;

        while (cruA != null){
            cruA = cruA.next;
            lenA++;
        }

        while (cruB != null){
            cruB = cruB.next;
            lenB++;
        }

        cruA = headA;
        cruB = headB;
        if (lenA >= lenB){
            int move = lenA - lenB;
            while (move > 0){
                cruA = cruA.next;
                move--;
            }
            for (int i = 0; i < lenB; i++) {
                if (cruA == cruB){
                    return cruA;
                }
                cruA = cruA.next;
                cruB = cruB.next;
            }
            return null;
        }else {
            int move = lenB - lenA;
            while (move > 0){
                cruB = cruB.next;
                move--;
            }
            for (int i = 0; i < lenA; i++) {
                if (cruA == cruB){
                    return cruA;
                }
                cruA = cruA.next;
                cruB = cruB.next;
            }
            return null;

        }


    }
}
