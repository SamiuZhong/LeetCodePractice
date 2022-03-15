package com.samiu.labuladong.cap222;

import com.samiu.structure.TreeNode;

public class LeetCode_98 {

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        if (root.left != null && root.val <= root.left.val)
            return false;

        if (root.right != null && root.val >= root.right.val)
            return false;

        return isValidBST(root.left) && isValidBST(root.right);
    }
}
