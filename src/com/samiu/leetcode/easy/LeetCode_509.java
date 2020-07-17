package com.samiu.leetcode.easy;

/**
 * 分类：动态规划
 * 斐波那契数列：https://leetcode-cn.com/problems/fibonacci-number/
 *
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
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     *
     * @param n
     * @return
     */
    private int fib(int n) {
        if (n <= 1) return n;
        else {
            int i = 0, j = 1;
            while (n-- > 1) {
                j = i + j;
                i = j - i;
            }
            return j;
        }
    }
}
