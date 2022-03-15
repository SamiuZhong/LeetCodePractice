package com.samiu.labuladong.cap2.esey;

import com.samiu.structure.TreeNode;

public class LeetCode_101 {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return check(root.left, root.right);
    }

    private boolean check(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) return false;

        return check(left.right, right.left) && check(left.left, right.right);
    }
}
