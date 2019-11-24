package org.jessenpan.leetcode.map;

/**
 * @author jessenpan
 * tag:map
 */
public class S1189MaximumNumberOfBalloons {

    public int maxNumberOfBalloons(String text) {
        int[] map = new int[5];
        int len = text.length();
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == 'b') {
                map[0]++;
            } else if (text.charAt(i) == 'a') {
                map[1]++;
            } else if (text.charAt(i) == 'l') {
                map[2]++;
            } else if (text.charAt(i) == 'o') {
                map[3]++;
            } else if (text.charAt(i) == 'n') {
                map[4]++;
            }
        }
        int[] origin = new int[] { 1, 1, 2, 2, 1 };
        int count = 0;
        while (true) {
            for (int i = 0; i < 5; i++) {
                if (map[i] - origin[i] >= 0) {
                    map[i] -= origin[i];
                } else {
                    return count;
                }
            }
            count++;
        }
    }
}
