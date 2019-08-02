package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S860LemonadeChange {

    public boolean lemonadeChange(int[] bills) {

        int sum5 = 0, sum10 = 0, sum20 = 0;

        int len = bills.length;
        for (int i = 0; i < len; i++) {
            if (bills[i] == 5) {
                sum5++;
            } else if (bills[i] == 10) {
                sum10++;
                if (sum5 <= 0) {
                    return false;
                }
                sum5--;
            } else if (bills[i] == 20) {
                sum20++;
                if (sum10 >= 1 && sum5 >= 1) {
                    sum10--;
                    sum5--;
                } else if (sum5 >= 3) {
                    sum5 -= 3;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }

}
