package com.samiu.labuladong.cap132;

import java.util.Stack;

public class LeetCode_20 {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (!stack.empty() && leftOf(c) == stack.peek())
                    stack.pop();
                else return false;
            }
        }
        return stack.empty();
    }

    char leftOf(char c) {
        if (c == '}') return '{';
        if (c == ')') return '(';
        return '[';
    }
}
