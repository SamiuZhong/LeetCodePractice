package com.samiu.labuladong.cap2.esey;

import com.samiu.structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode_94 {

    private final List<Integer> list = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        build(root);
        return list;
    }

    private void build(TreeNode node) {
        if (node == null) {
            return;
        }
        build(node.left);
        list.add(node.val);
        build(node.right);
    }
}
