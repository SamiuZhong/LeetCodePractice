package com.samiu.offer.medium;

import com.samiu.structure.TreeNode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 剑指Offer 07：https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
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
        TreeNode treeNode1 = offer_07.buildTree(preorder, inorder);
        TreeNode treeNode2 = offer_07.buildTree2(preorder, inorder);
        TreeNode.print(treeNode1);
        System.out.println("=====================");
        TreeNode.print(treeNode2);
    }

    /**
     * 递归
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     *
     * @param preorder
     * @param inorder
     * @return
     */
    private TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0)
            return null;
        Map<Integer, Integer> map = new HashMap<>();
        int length = preorder.length;
        for (int i = 0; i < length; i++) {
            map.put(inorder[i], i);
        }
        TreeNode root = buildTree(preorder, 0, length - 1, inorder, 0, length - 1, map);
        return root;
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, Map<Integer, Integer> map) {
        if (preStart > preEnd)
            return null;
        int rootVal = preorder[preStart];
        TreeNode root = new TreeNode(rootVal);

        if (preStart != preEnd) {
            int rootIndex = map.get(rootVal);
            int leftNodes = rootIndex - inStart;
            int rightNodes = inEnd - rootIndex;
            TreeNode leftSubtree = buildTree(preorder, preStart + 1, preStart + leftNodes, inorder, inStart, rootIndex - 1, map);
            TreeNode rightSubtree = buildTree(preorder, preEnd - rightNodes + 1, preEnd, inorder, rootIndex + 1, inEnd, map);
            root.left = leftSubtree;
            root.right = rightSubtree;
        }
        return root;
    }

    /**
     * 迭代
     * 时间复杂度 O(n)
     * 空间复杂度 O(n)
     *
     * @param preorder
     * @param inorder
     * @return
     */
    private TreeNode buildTree2(int[] preorder, int[] inorder) {
        if (preorder == null || preorder.length == 0)
            return null;
        TreeNode root = new TreeNode(preorder[0]);
        int length = preorder.length;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        int inorderIndex = 0;
        for (int i = 1; i < length; i++) {
            int preorderVal = preorder[i];
            TreeNode node = stack.peek();
            if (node.val != inorder[inorderIndex]) {
                node.left = new TreeNode(preorderVal);
                stack.push(node.left);
            } else {
                while (!stack.isEmpty() && stack.peek().val == inorder[inorderIndex]) {
                    node = stack.pop();
                    inorderIndex++;
                }
                node.right = new TreeNode(preorderVal);
                stack.push(node.right);
            }
        }
        return root;
    }
}
