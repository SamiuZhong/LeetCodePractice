package com.samiu.leetcode.medium;

/**
 * @author Samiu 2020/7/7
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class LeetCode_91 {

    private int numDecodings(String s) {
        if (s.charAt(0) == '0') return 0;

        char[] chars = s.toCharArray();
        return decode(chars, chars.length - 1);
    }

    /**
     * 递归
     *
     * @param chars
     * @param index
     * @return
     */
    private int decode(char[] chars, int index) {
        //处理到了第一个字符串，只能有一种解码方法，返回1
        if (index <= 0) return 1;

        int count = 0;

        char curr = chars[index];
        char prev = chars[index - 1];

        //当前字符比“0”大，则直接利用它之前的字符串求得的结果
        if (curr > '0')
            count = decode(chars, index - 1);

        //由两个字符串构成的数字，值必须要属于[1,26]，否则无法解码
        if (prev == '1' || (prev == '2') && curr <= '6')
            count += decode(chars, index - 2);

        return count;
    }

    public static void main(String[] args) {
        LeetCode_91 leetCode_91 = new LeetCode_91();
        System.out.println(leetCode_91.numDecodings("2222222222222222"));
    }
}
