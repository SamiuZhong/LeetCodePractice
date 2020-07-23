package com.samiu.offer.medium;

/**
 * 剑指Offer 13：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof/
 *
 * @author Samiu 2020/7/21
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_13 {

    public static void main(String[] args) {
        Offer_13 offer_13 = new Offer_13();
        System.out.println(offer_13.movingCount(2, 3, 1));
    }

    private int m, n, k;
    private boolean[][] visited;

    /**
     * DFS
     * 时间复杂度 O(m*n)
     * 空间复杂度 O(m*n)
     *
     * @param m
     * @param n
     * @param k
     * @return
     */
    private int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        this.visited = new boolean[m][n];
        return dfs(0, 0, 0, 0);
    }

    private int dfs(int i, int j, int si, int sj) {
        if (i >= m || j >= n || k < si + sj || visited[i][j])
            return 0;
        visited[i][j] = true;
        return 1 + dfs(i + 1, j, (i + 1) % 10 != 0 ? si + 1 : si - 8, sj)
                + dfs(i, j + 1, si, (j + 1) % 10 != 0 ? sj + 1 : sj - 8);
    }

}
