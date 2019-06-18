package org.jessenpan.leetcode.string;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:string
 */
public class S556NextGreaterElementIII {

    public int nextGreaterElement(int n) {

        char[] chars = Integer.toString(n).toCharArray();
        int len = chars.length;
        int i = len - 1;
        for (; i > 0; i--) {
            if (chars[i] > chars[i - 1]) {
                break;
            }
        }
        if (i == 0) {
            return -1;
        }
        int j = len - 1;
        for (; j >= i; j--) {
            if (chars[j] > chars[i - 1]) {

                char tmp = chars[i - 1];
                chars[i - 1] = chars[j];
                chars[j] = tmp;
                break;
            }
        }

        Arrays.sort(chars,i,chars.length);
        long val=Long.parseLong(new String(chars));
        return val > Integer.MAX_VALUE ? -1 : (int) val;
    }

}
