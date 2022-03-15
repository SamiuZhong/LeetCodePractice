package com.samiu.labuladong.cap216;

import com.samiu.structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LeetCode_114 {

    private final List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        travers(root);
        return list;
    }

    /**
     * 回溯法
     */
    private void travers(TreeNode root) {
        if (root == null) return;

        list.add(root.val);

        travers(root.left);
        travers(root.right);
    }

    /**
     * 动态规划
     */
    private List<Integer> solution(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;

        res.add(root.val);
        res.addAll(solution(root.left));
        res.addAll(solution(root.right));
        return res;
    }
}
