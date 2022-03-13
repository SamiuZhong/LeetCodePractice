package com.samiu.labuladong.cap112;

import java.util.Arrays;

public class LeetCode_1109 {

    public static void main(String[] args) {
        LeetCode_1109 leetCode_1109 = new LeetCode_1109();
        int[][] bookings = {{1, 2, 10}, {2, 3, 20}, {2, 5, 25}};
        int n = 5;
        System.out.println(Arrays.toString(leetCode_1109.corpFlightBookings(bookings, n)));
    }

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        Difference difference = new Difference(res);
        for (int[] booking : bookings) {
            difference.increment(booking[0] - 1, booking[1] - 1, booking[2]);
        }
        res = difference.result();
        return res;
    }
}
