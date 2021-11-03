package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S765CouplesHoldingHands {

    //TODO study
    public int minSwapsCouples(int[] row) {
        int ans = 0;
        for (int i = 0; i < row.length; i += 2) {
            int x = row[i];
            if (row[i + 1] == (x ^ 1)) {
                continue;
            }
            ans++;
            for (int j = i + 1; j < row.length; ++j) {
                if (row[j] == (x ^ 1)) {
                    row[j] = row[i + 1];
                    row[i + 1] = x ^ 1;
                    break;
                }
            }
        }
        return ans;
    }

}
