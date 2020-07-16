package com.samiu.leetcode.easy;

import com.samiu.structure.TreeNode;

/**
 * @author Samiu 2020/7/7
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class LeetCode_783 {

    int result;

    private int minDiffInBST(TreeNode root) {
        //TODO 有问题
        if (root.left != null)
            result = Math.abs(root.val - root.left.val);
        else
            result = Math.abs(root.val - root.right.val);
        minDiff(root);
        return result;
    }

    private void minDiff(TreeNode node) {
        if (node.left != null) {
            result = Math.min(result, Math.abs(node.val - node.left.val));
            minDiff(node.left);
        }
        if (node.right != null) {
            result = Math.min(result, Math.abs(node.val - node.right.val));
            minDiff(node.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = TreeNode.createTestData("[90,69,null,49,89,null,52,null,null,null,null]");
        TreeNode.print(root);
//        LeetCode_783 leetCode_783 = new LeetCode_783();
//        System.out.println(leetCode_783.minDiffInBST(root));
    }
}
