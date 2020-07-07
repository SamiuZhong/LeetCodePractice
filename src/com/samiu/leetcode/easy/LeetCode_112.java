package com.samiu.leetcode.easy;

import com.samiu.structure.TreeNode;

/**
 * @author Samiu 2020/7/7
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class LeetCode_112 {

    /**
     * 递归
     *
     * @param root
     * @param sum
     * @return
     */
    private boolean hasPathSum(TreeNode root, int sum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null)
            return sum == root.val;
        return hasPathSum(root.left, sum - root.val)
                || hasPathSum(root.right, sum - root.val);
    }
}
