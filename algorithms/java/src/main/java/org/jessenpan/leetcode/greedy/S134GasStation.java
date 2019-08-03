package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S134GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {

        int len = gas.length;
        for (int i = 0; i < len; i++) {

            int cnt = 0, idx = i, curGas = 0;
            boolean isMatch = true;
            while (cnt < len) {

                curGas = curGas + gas[idx] - cost[idx];
                if (curGas < 0) {
                    isMatch = false;
                    break;
                }
                idx = (idx + 1) % len;
                cnt++;
            }
            if (isMatch) {
                return i;
            }
        }
        return -1;
    }

}
