package com.samiu.offer.easy;

import com.samiu.structure.ListNode;

import java.util.Arrays;
import java.util.Stack;

/**
 * 剑指Offer 06：https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 *
 * @author Samiu 2020/7/21
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_06 {

    public static void main(String[] args) {
        Offer_06 offer_06 = new Offer_06();
        ListNode head = ListNode.createTestData("[]");
        System.out.println(Arrays.toString(offer_06.reversePrint(head)));
    }

    /**
     * 时间复杂度 O(2n)
     * 空间复杂度 O(n)
     *
     * @param head
     * @return
     */
    private int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
        }

        int size = stack.size();
        int[] array = new int[size];
        for (int i = 0; i < size; i++)
            array[i] = stack.pop();
        return array;
    }
}
