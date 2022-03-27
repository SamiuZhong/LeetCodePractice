package com.samiu.labuladong.cap411;

public class LeetCode_509 {

    public static void main(String[] args) {
        LeetCode_509 leetCode_509 = new LeetCode_509();
        System.out.println(leetCode_509.fib(30));
    }

    public int fib(int n) {
        if (n <= 1) return n;
        int j = 0;
        int k = 1;
        for (int i = 2; i <= n; i++) {
            k = j + k;
            j = k - j;
        }
        return k;
    }
}
