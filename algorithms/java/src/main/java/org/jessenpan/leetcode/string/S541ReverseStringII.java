package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S541ReverseStringII {

    public String reverseStr(String s, int k) {
        int len = s.length();
        int times = (int) Math.ceil(len / (2.0 * k));
        char[] reversedChars = new char[len];
        s.getChars(0, len, reversedChars, 0);

        int left, right;
        char tmp;
        for (int i = 0; i < times; i++) {
            left = i * k * 2;
            right = left + 2 * k - k - 1;
            if (right > (len - 1)) {
                right = len - 1;
            }
            while (left < right) {
                tmp = reversedChars[left];
                reversedChars[left] = reversedChars[right];
                reversedChars[right] = tmp;
                left++;
                right--;
            }
        }

        return String.valueOf(reversedChars);
    }
}
