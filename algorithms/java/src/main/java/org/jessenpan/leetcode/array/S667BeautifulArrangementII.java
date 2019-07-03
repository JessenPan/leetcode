package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S667BeautifulArrangementII {

    public int[] constructArray(int n, int k) {
        int[] array = new int[n];
        int descCount = k + 1;
        int incCount = 1;
        for (int i = 1; i < n + 1; i++) {
            if (i > k + 1) {
                array[i - 1] = i;
                continue;
            }
            if ((i & 1) == 0) {
                array[i - 1] = descCount;
                descCount--;
            } else {
                array[i - 1] = incCount;
                incCount++;
            }
        }
        return array;
    }

}
