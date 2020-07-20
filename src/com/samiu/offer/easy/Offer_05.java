package com.samiu.offer.easy;

/**
 * 剑指Offer 05：https://leetcode-cn.com/problems/ti-huan-kong-ge-lcof/
 *
 * @author Samiu 2020/7/21
 * @github https://github.com/SamiuZhong
 * @blog samiu.top
 */
public class Offer_05 {

    public static void main(String[] args) {
        Offer_05 offer_05 = new Offer_05();
        String s = "We are happy";
        System.out.println(offer_05.replaceSpace(s));
    }

    private String replaceSpace(String s) {
        int length = s.length();
        char[] array = new char[3 * length];
        int size = 0;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                array[size++] = '%';
                array[size++] = '2';
                array[size++] = '0';
            } else
                array[size++] = c;
        }
        return new String(array, 0, size);
    }
}
