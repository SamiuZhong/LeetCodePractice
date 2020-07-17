package com.samiu.leetcode.easy;

import com.samiu.structure.TreeNode;

import java.util.ArrayDeque;

/**
 * 分类：树
 * 相同的树：https://leetcode-cn.com/problems/same-tree/
 *
 * @author Samiu 2020/7/17
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class LeetCode_100 {

    public static void main(String[] args) {
        LeetCode_100 leetCode_100 = new LeetCode_100();
        TreeNode p = TreeNode.createTestData("[1,2,3]");
        TreeNode q = TreeNode.createTestData("[1,2,3]");
        System.out.println(leetCode_100.isSameTree1(p, q));
        System.out.println(leetCode_100.isSameTree2(p, q));
    }

    /**
     * 递归
     * 时间复杂度 O(n)
     * 空间复杂度 O(logn)~O(n)
     *
     * @param p
     * @param q
     * @return
     */
    private boolean isSameTree1(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;
        return isSameTree1(p.right, q.right)
                && isSameTree1(p.left, q.left);
    }

    /**
     * 迭代
     * 时间复杂度 O(n)
     * 空间复杂度 O(logn)~O(n)
     *
     * @param p
     * @param q
     * @return
     */
    private boolean isSameTree2(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (!check(p, q)) return false;

        ArrayDeque<TreeNode> deqP = new ArrayDeque<>();
        ArrayDeque<TreeNode> deqQ = new ArrayDeque<>();
        deqP.addLast(p);
        deqQ.addLast(q);

        while (!deqP.isEmpty()) {
            p = deqP.removeFirst();
            q = deqQ.removeFirst();

            if (!check(p, q)) return false;
            if (p != null) {
                if (!check(p.left, q.left)) return false;
                if (p.left != null) {
                    deqP.addLast(p.left);
                    deqQ.addLast(q.left);
                }

                if (!check(p.right, q.right)) return false;
                if (p.right != null) {
                    deqP.addLast(p.right);
                    deqQ.addLast(q.right);
                }
            }
        }
        return true;
    }

    private boolean check(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val;
    }
}
