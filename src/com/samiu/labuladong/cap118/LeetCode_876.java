package com.samiu.labuladong.cap118;

import com.samiu.structure.ListNode;

public class LeetCode_876 {

    public ListNode middleNode(ListNode head) {
        return findMiddleNode(head);
    }

    private ListNode findMiddleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
