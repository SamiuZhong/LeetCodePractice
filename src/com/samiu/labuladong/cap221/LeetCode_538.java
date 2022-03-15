package com.samiu.labuladong.cap221;

import com.samiu.structure.TreeNode;

public class LeetCode_538 {

    public TreeNode convertBST(TreeNode root) {
        travers(root);
        return root;
    }

    private int sum = 0;

    private void travers(TreeNode root) {
        if (root == null) return;

        travers(root.right);
        sum += root.val;
        root.val = sum;
        travers(root.left);
    }
}
