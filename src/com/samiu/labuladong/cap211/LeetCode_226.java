package com.samiu.labuladong.cap211;

import com.samiu.structure.TreeNode;

public class LeetCode_226 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
