package com.samiu.offer.easy;

import com.samiu.structure.TreeNode;

/**
 * 剑指Offer 27：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof/
 *
 * @author Samiu 2020/7/23
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_27 {

    /**
     * 递归
     * 时间复杂度 O(n)
     *
     * @param root
     * @return
     */
    private TreeNode mirrorTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = root.left;
        root.left = mirrorTree(root.right);
        root.right = mirrorTree(temp);
        return root;
    }
}
