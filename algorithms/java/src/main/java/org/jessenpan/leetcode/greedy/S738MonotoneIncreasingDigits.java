package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S738MonotoneIncreasingDigits {

    public int monotoneIncreasingDigits(int n) {
        char[] chars = String.valueOf(n).toCharArray();
        int len = chars.length;

        int flag = len;
        for (int i = len - 1; i >= 1; i--) {
            if (chars[i] < chars[i - 1]) {
                flag = i;
                chars[i - 1]--;
            }
        }

        for (int i = flag; i < len; i++) {
            chars[i] = '9';
        }
        return Integer.parseInt(new String(chars));
    }

}
