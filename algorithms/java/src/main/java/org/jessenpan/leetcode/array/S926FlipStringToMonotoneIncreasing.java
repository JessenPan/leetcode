package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S926FlipStringToMonotoneIncreasing {

    
    //TODO 
    public int minFlipsMonoIncr(String s) {
        char[] arr = s.toCharArray();
        int right = arr.length - 1;
        while (right >= 0 && arr[right] == '1') {
            right--;
        }
        int count0 = 0, count1 = 0;
        int result = 0;
        for (int i = 0; i <= right; i++) {
            char c = arr[i];
            if (c == '0') {
                count0++;
            } else {
                if (count0 >= count1) {
                    result += count1;
                    count0 = 0;
                    count1 = 0;
                }
                count1++;
            }
        }
        result += Math.min(count1, count0);
        return result;
    }

}
