package com.samiu.offer.medium;

import com.samiu.structure.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * 剑指Offer 34：https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof/
 *
 * @author Samiu 2020/7/24
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_34 {

    private LinkedList<List<Integer>> res = new LinkedList<>();
    LinkedList<Integer> path = new LinkedList<>();

    /**
     * 回溯法
     * 时间复杂度 O(n)
     *
     * @param root
     * @param sum
     * @return
     */
    private List<List<Integer>> pathSum(TreeNode root, int sum) {
        recur(root, sum);
        return res;
    }

    private void recur(TreeNode root, int tar) {
        if (root == null) return;

        path.add(root.val);
        tar -= root.val;
        if (tar == 0 && root.left == null && root.right == null)
            res.add(new LinkedList<>(path));
        recur(root.left, tar);
        recur(root.right, tar);
        path.removeLast();      //回溯
    }
}
