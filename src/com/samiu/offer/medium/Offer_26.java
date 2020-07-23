package com.samiu.offer.medium;

import com.samiu.structure.TreeNode;

/**
 * 剑指Offer 26：https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_26 {

    /**
     * 先序遍历 + 判断
     * 时间复杂度 O(mn)
     *
     * @param a
     * @param b
     * @return
     */
    private boolean isSubStructure(TreeNode a, TreeNode b) {
        return (a != null && b != null) &&
                (recur(a, b) || isSubStructure(a.left, b) || isSubStructure(a.right, b));
    }

    private boolean recur(TreeNode a, TreeNode b) {
        if (b == null) return true;
        if (a == null || a.val != b.val) return false;
        return recur(a.left, b.left) && recur(a.right, b.right);
    }
}
