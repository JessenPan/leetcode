package org.jessenpan.leetcode.sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jessenpan
 * tag:sort
 */
public class S79LargestNumber {

    public String largestNumber(int[] nums) {

        int len = nums.length;
        String[] strs = new String[len];
        for (int i = 0; i < len; i++) {
            strs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strs, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                }

                int o1Len = o1.length(), o2Len = o2.length();
                int len = Math.min(o1Len, o2Len);
                for (int i = 0; i < len; i++) {
                    if (o1.charAt(i) > o2.charAt(i)) {
                        return -1;
                    } else if (o1.charAt(i) < o2.charAt(i)) {
                        return 1;
                    }
                }
                String o1Start = o1 + o2;
                String o2Start = o2 + o1;
                return o2Start.compareTo(o1Start);
            }
        });
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        boolean hasValue = false;
        len = sb.length();
        int start = -1;
        for (int i = 0; i < len; i++) {
            if (hasValue) {
                break;
            }
            if (sb.charAt(i) == '0') {
                start = i;
            } else if (sb.charAt(i) != '0') {
                hasValue = true;
            }
        }
        String str = sb.substring(start + 1);
        return str.isEmpty() ? "0" : str;
    }

}
