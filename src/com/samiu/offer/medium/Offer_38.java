package com.samiu.offer.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

/**
 * 剑指Offer 38：https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 *
 * @author Samiu 2020/7/24
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_38 {

    private List<String> res = new LinkedList<>();
    private char[] c;

    /**
     * DFS
     * 时间复杂度 O(n!)
     *
     * @param s
     * @return
     */
    private String[] permutation(String s) {
        c = s.toCharArray();
        dfs(0);
        return res.toArray(new String[res.size()]);
    }

    private void dfs(int x) {
        if (x == c.length - 1) {
            res.add(String.valueOf(c));
            return;
        }
        HashSet<Character> set = new HashSet<>();
        for (int i = x; i < c.length; i++) {
            if (set.contains(c[i]))
                continue;
            set.add(c[i]);
            swap(i, x);
            dfs(x + 1);
            swap(i, x);
        }
    }

    private void swap(int a, int b) {
        char temp = c[a];
        c[a] = c[b];
        c[b] = temp;
    }
}
