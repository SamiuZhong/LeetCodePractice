package com.samiu.offer;

import com.samiu.structure.TreeNode;

/**
 * 剑指Offer 07：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 * 难度：medium
 *
 * @author Samiu 2020/7/21
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_07 {

    public static void main(String[] args) {
        Offer_07 offer_07 = new Offer_07();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode treeNode = offer_07.buildTree(preorder, inorder);
        TreeNode.print(treeNode);
    }

    private TreeNode buildTree(int[] preorder, int[] inorder) {

    }

}
