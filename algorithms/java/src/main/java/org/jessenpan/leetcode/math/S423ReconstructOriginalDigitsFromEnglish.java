package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S423ReconstructOriginalDigitsFromEnglish {

    public String originalDigits(String s) {
        // building hashmap letter -> its frequency
        char[] count = new char[26 + (int) 'a'];
        for (char letter : s.toCharArray()) {
            count[letter]++;
        }

        int[] out = new int[10];
        out[0] = count['z'];
        out[2] = count['w'];
        out[4] = count['u'];
        out[6] = count['x'];
        out[8] = count['g'];
        out[3] = count['h'] - out[8];
        out[5] = count['f'] - out[4];
        out[7] = count['s'] - out[6];
        out[9] = count['i'] - out[5] - out[6] - out[8];
        out[1] = count['n'] - out[7] - 2 * out[9];

        StringBuilder output = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < out[i]; j++) {
                output.append(i);
            }
        }
        return output.toString();

    }

}
