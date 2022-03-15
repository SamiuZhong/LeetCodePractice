package com.samiu.labuladong.cap222;

import com.samiu.structure.TreeNode;

public class LeetCode_701 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        }

        if (root.val > val) {
            root.left = insertIntoBST(root.left, val);
        }

        return root;
    }
}
