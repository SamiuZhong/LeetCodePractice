package com.samiu.labuladong.cap221;

import com.samiu.structure.TreeNode;

public class LeetCode_230 {

    public int kthSmallest(TreeNode root, int k) {
        travers(root, k);
        return res;
    }

    private int res = 0;
    private int rank = 0;

    private void travers(TreeNode root, int k) {
        if (root == null) return;
        travers(root.left, k);
        rank++;
        if (k == rank) {
            res = root.val;
            return;
        }
        travers(root.right, k);
    }
}
