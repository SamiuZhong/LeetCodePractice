package com.samiu.labuladong.cap216;

import com.samiu.structure.TreeNode;

public class LeetCode_104 {

    private int res = 0;
    private int depth = 0;

    public int maxDepth(TreeNode root) {
        travers(root);
        return res;
    }

    /**
     * 回溯法
     */
    private void travers(TreeNode root) {
        if (root == null) {
            res = Math.max(res, depth);
            return;
        }
        depth++;
        travers(root.left);
        travers(root.right);
        depth--;
    }

    /**
     * 动态规划
     */
    private int maxDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftMax = maxDepth2(root.left);
        int rightMax = maxDepth2(root.right);
        int res = Math.max(leftMax, rightMax) + 1;

        return res;
    }
}
