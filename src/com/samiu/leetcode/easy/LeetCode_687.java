package com.samiu.leetcode.easy;

import com.samiu.structure.TreeNode;

/**
 * @author Samiu 2020/7/7
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class LeetCode_687 {

    private int ans;

    /**
     * 递归
     *
     * @param root
     * @return
     */
    private int longestUnivaluePath(TreeNode root) {
        ans = 0;
        arrowLength(root);
        return ans;
    }

    private int arrowLength(TreeNode node) {
        if (node == null) return 0;

        int left = arrowLength(node.left);
        int right = arrowLength(node.right);
        int arrowLeft = 0, arrowRight = 0;

        if (node.left != null && node.left.val == node.val)
            arrowLeft += left + 1;
        if (node.right != null && node.right.val == node.val)
            arrowRight += right + 1;

        ans = Math.max(ans, arrowLeft + arrowRight);
        return Math.max(arrowLeft, arrowRight);
    }
}
