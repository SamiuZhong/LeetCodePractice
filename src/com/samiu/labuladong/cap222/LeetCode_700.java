package com.samiu.labuladong.cap222;

import com.samiu.structure.TreeNode;

public class LeetCode_700 {

    public TreeNode searchBST(TreeNode root, int val) {
        return search(root, val);
    }

    private TreeNode search(TreeNode root, int target) {
        if (root == null) {
            return null;
        }

        if (root.val > target) {
            return search(root.left, target);
        }
        if (root.val < target) {
            return search(root.right, target);
        }
        return root;
    }
}
