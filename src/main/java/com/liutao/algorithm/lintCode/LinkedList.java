package com.liutao.algorithm.lintCode;

/**
 * Created by liutao42
 * on 2017/3/1.
 */
public class LinkedList {

    class ListNode {
        int value;
        ListNode next;

        ListNode(int value) {
            this.value = value;
        }
    }

    public ListNode removeElements(ListNode head, int value) {
        ListNode result = head;
        if (head == null) {
            return null;
        }
        while (head.next != null) {
            if (head.next.value == value) {
                if (head.next.next != null) {
                    head.next = head.next.next;
                } else {
                    head.next = null;
                    break;
                }
            } else {
                head= head.next;
            }
        }
        if (result.value == value) {
            return result.next;
        }
        return result;
    }
}
