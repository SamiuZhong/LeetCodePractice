package com.samiu.offer.medium;

import java.util.Stack;

/**
 * 剑指Offer 33：二叉搜索树的后续遍历
 * https://leetcode-cn.com/problems/er-cha-sou-suo-shu-de-hou-xu-bian-li-xu-lie-lcof/
 *
 * @author Samiu 2020/7/24
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_33 {

    /**
     * 递归
     * 时间复杂度 O(n^2)
     *
     * @param postorder
     * @return
     */
    private boolean verifyPostorder(int[] postorder) {
        return recur(postorder, 0, postorder.length - 1);
    }

    private boolean recur(int[] postorder, int i, int j) {
        if (i > j) return true;
        int p = i;
        while (postorder[p] < postorder[j]) p++;
        int m = p;
        while (postorder[p] < postorder[j]) p++;
        return p == j && recur(postorder, i, m - 1) && recur(postorder, m, j - 1);
    }

    /**
     * 辅助栈
     * 时间复杂度 O(n)
     *
     * @param postorder
     * @return
     */
    private boolean verifyPostorder2(int[] postorder) {
        Stack<Integer> stack = new Stack<>();
        int root = Integer.MAX_VALUE;
        for (int i = postorder.length - 1; i >= 0; i--) {
            if (postorder[i] > root) return false;
            while (!stack.isEmpty() && stack.peek() > postorder[i])
                root = stack.pop();
            stack.add(postorder[i]);
        }
        return true;
    }
}
