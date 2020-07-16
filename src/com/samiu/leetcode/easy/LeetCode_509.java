package com.samiu.leetcode.easy;

/**
 * @author Samiu 2020/7/8
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class LeetCode_509 {

    public static void main(String[] args) {
        LeetCode_509 leetCode_509 = new LeetCode_509();
        System.out.println(leetCode_509.fib(3));
    }

    /**
     * 递归
     * 时间复杂度 O(2^n)
     *
     * @param n
     * @return
     */
    private int fib(int n) {
        if (n <= 1)
            return n;
        else
            return fib(n - 1) + fib(n - 2);
    }
}
