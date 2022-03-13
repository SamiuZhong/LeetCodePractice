package com.samiu.labuladong.cap113;

import java.util.HashMap;

public class LeetCode_76 {

    public static void main(String[] args) {
        LeetCode_76 leetCode_76 = new LeetCode_76();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(leetCode_76.minWindow(s, t));
    }

    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        //将t中元素出现的次数存入哈希表
        for (int i = 0; i < t.length(); i++) {
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) + 1);
        }
        //rest记录滑动窗口中不包含的t字符个数，初始化为map的大小。这里可以无视字符出现次数
        int rest = map.size();
        //初始化滑动窗口
        int left = 0, right = 0;
        //将滑动窗口提前移到第一个被t包含的字符的索引位置
        while (left < s.length() && !map.containsKey(s.charAt(left))) {
            left++;
        }
        right = left;
        //初始化最后要的滑动窗口
        int res_left = 0, res_right = 0;
        //初始化最长窗口大小
        int len = 100001;
        while (right < s.length()) {
            //如果map中存在right位置的字符，将其对应的值-1。如果减完之后，值变成了0，说明当前窗口包含t中所有该字符，将t中剩余未出现的字符数rest--
            if (map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                if (map.get(s.charAt(right)) == 0) {
                    rest--;
                }
            }
            //若当前right位置字符与left位置字符相同，并且窗口中该字符次数大于t中出现次数：在map中对其值+1，将left指针右移
            if ((right != left && s.charAt(right) == s.charAt(left) && map.get(s.charAt(left)) < 0)) {
                map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                left++;
                //继续对left指针判断是否往右移：若left位置字符未在t中出现，或者在t中出现但是窗口中出现次数超了，left右移
                while (!map.containsKey(s.charAt(left)) || map.get(s.charAt(left)) < 0) {
                    if (map.containsKey(s.charAt(left)) && map.get(s.charAt(left)) < 0) {
                        map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                    }
                    left++;
                }
            }
            //left移完之后，判断是否更新窗口大小和窗口位置（rest<=0说明窗口中包含t中所有字符）
            if (rest <= 0) {
                if (len > right - left + 1) {
                    len = right - left + 1;
                    res_left = left;
                    res_right = right;
                }
            }
            //right指针右移
            right++;
        }
        //若right移完了，rest还大于0，说明整个s都包含不了t中字符
        if (rest > 0) {
            return "";
        }
        //返回最终窗口
        return s.substring(res_left, res_right + 1);
    }
}
