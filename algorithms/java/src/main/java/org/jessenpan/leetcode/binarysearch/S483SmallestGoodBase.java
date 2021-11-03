package org.jessenpan.leetcode.binarysearch;

/**
 * @author jessenpan
 * tag:binarysearch
 */
public class S483SmallestGoodBase {

    //TODO
    public String smallestGoodBase(String y) {
        long num = Long.parseLong(y);
        int maxX = (int) (Math.log(num + 1) / Math.log(2) - 1);
        for (int x = maxX; x >= 2; x--) {
            long ks = 2, ke = num - 1;
            while (ks <= ke) {
                long k = ks + ((ke - ks) >> 1);
                int diff = compareWithNum(x + 1, k, num);
                if (diff == 0) {
                    return String.valueOf(k);
                } else if (diff < 0) {
                    ks = k + 1;
                } else {
                    ke = k - 1;
                }
            }
        }
        return String.valueOf(num - 1);
    }

    private int compareWithNum(int len, long radix, long num) {
        long base = 1;
        long sum = 0;
        for (int i = 0; i < len; i++) {
            if (Long.MAX_VALUE - sum < base) {
                return 1;
            }
            sum += base;
            if (sum > num) {
                return 1;
            }
            if (Long.MAX_VALUE / base < radix) {
                base = Long.MAX_VALUE;
            } else {
                base *= radix;
            }
        }
        return sum == num ? 0 : -1;
    }
}
