package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S670MaximumSwap {

    public int maximumSwap(int num) {
        String sNum = String.valueOf(num);
        char[] sNumArr = sNum.toCharArray();
        int len = sNumArr.length;

        int maxIdx;
        for (int i = 0; i < len - 1; i++) {
            maxIdx = i + 1;
            for (int j = i + 1; j < len; j++) {
                if (sNumArr[maxIdx] <= sNumArr[j]) {
                    maxIdx = j;
                }
            }
            if (sNumArr[i] < sNumArr[maxIdx]) {
                char tmp = sNumArr[i];
                sNumArr[i] = sNumArr[maxIdx];
                sNumArr[maxIdx] = tmp;
                break;
            }
        }

        int max = 0;
        for (char c : sNumArr) {
            max = max * 10 + c - '0';
        }
        return max;
    }

}
