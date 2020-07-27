package com.samiu.offer.easy;

import com.samiu.structure.ListNode;

/**
 * 剑指Offer 24：反转链表
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_24 {

    /**
     * 双指针
     *
     * @param head
     * @return
     */
    private ListNode reverseList(ListNode head) {
        ListNode pre = head, cur = null;
        while (pre != null) {
            ListNode temp = pre.next;
            pre.next = cur;
            cur = pre;
            pre = temp;
        }
        return cur;
    }
}