package com.samiu.offer.easy;

import com.samiu.structure.ListNode;

/**
 * 剑指Offer 18：删除链表的节点
 * https://leetcode-cn.com/problems/shan-chu-lian-biao-de-jie-dian-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_18 {

    public static void main(String[] args) {
        Offer_18 offer_18 = new Offer_18();
        ListNode head = ListNode.createTestData("[4,5,1,9]");
        int val = 9;
        ListNode node = offer_18.deleteNode(head, val);
        ListNode.print(node);
    }

    /**
     * 双指针
     * 时间复杂度 O(n)
     *
     * @param head
     * @param val
     * @return
     */
    private ListNode deleteNode(ListNode head, int val) {
        if (head.val == val) return head.next;
        ListNode pre = head, cur = head.next;
        while (cur != null && cur.val != val) {
            pre = cur;
            cur = cur.next;
        }
        if (cur != null) pre.next = cur.next;
        return head;
    }
}
