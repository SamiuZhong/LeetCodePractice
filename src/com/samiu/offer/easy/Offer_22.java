package com.samiu.offer.easy;

import com.samiu.structure.ListNode;

/**
 * 剑指Offer 22：https://leetcode-cn.com/problems/lian-biao-zhong-dao-shu-di-kge-jie-dian-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_22 {

    public static void main(String[] args) {
        Offer_22 offer_22 = new Offer_22();
    }

    /**
     * 快慢指针
     * 时间复杂度 O(n)
     *
     * @param head
     * @param k
     * @return
     */
    private ListNode getKthFromEnd(ListNode head, int k) {
        ListNode pre = head, cur = head;
        int count = 1;
        while (count < k) {
            if (cur.next == null)
                return null;
            cur = cur.next;
            count++;
        }
        while (cur.next != null) {
            cur = cur.next;
            pre = pre.next;
        }
        return pre;
    }
}
