package LinkedAlgo;

import domain.ListNode;

import java.util.List;

public class MyLinkedList {
    public int size;
    public ListNode head;

    public MyLinkedList() {
        size = 0;
        head = new ListNode();
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode cru = head;
        while (index >= 0) {
            cru = cru.next;
            index--;
        }
        return cru.val;


    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        head.next = newNode;
        size++;


    }

    public void addAtTail(int val) {
        addAtIndex(size,val);

    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        ListNode cru = head;
        while (index > 0){
            cru = cru.next;
            index--;
        }
        ListNode newNode = new ListNode(val);
        newNode.next = cru.next;
        cru.next = newNode;
        size++;

    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        ListNode cru = head;
        while (index > 0){
            cru = cru.next;
            index--;
        }
        cru.next = cru.next.next;
        size--;

    }


}
