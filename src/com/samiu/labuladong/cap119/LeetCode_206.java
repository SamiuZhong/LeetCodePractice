package com.samiu.labuladong.cap119;

import com.samiu.structure.ListNode;

public class LeetCode_206 {

    public ListNode reverseList(ListNode head) {
        return reverse(head);
    }

    ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
