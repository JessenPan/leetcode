package org.jessenpan.leetcode.doublepointer;

/**
 * @author jessenpan
 * tag:doublePointer
 */
public class S424LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int[] record = new int[26];
        int max = 0, count = 0, category = 0, left = 0, right = 0, len = s.length();
        while (right < len) {
            int idx = s.charAt(right) - 'A';
            record[idx]++;
            count++;
            int maxElement = maxElement(record);
            while (count - maxElement > k) {
                record[s.charAt(left) - 'A']--;
                count--;
                left++;
                maxElement = maxElement(record);
            }
            max = Math.max(max, count);
            right++;
        }
        return max;
    }

    private int maxElement(int[] record) {
        int len = record.length;
        int max = 0;
        for (int value : record) {
            max = Math.max(max, value);
        }
        return max;
    }

}
