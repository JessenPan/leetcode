package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S906SuperPalindromes {

    public int superpalindromesInRange(String L, String R) {
        long lNum = (long) Math.sqrt(Long.parseLong(L));
        long rNum = (long) Math.sqrt(Long.parseLong(R));
        int count = 0;
        if (lNum <= 3 && rNum >= 3)
            count++;
        long i = 0;
        while (true) {
            i++;
            long temp = changeRadix(i, 10, 3);
            if (temp > rNum)
                break;
            if (temp >= lNum && isPalindrome(temp) && isPalindrome(temp * temp)) {
                count++;
            }
        }
        return count;
    }

    public long changeRadix(long in, int source, int to) {
        long re = 0L;
        long t = 1;
        do {
            re += (in % to) * t;
            t *= source;
            in /= to;
        } while (in > 0);
        return re;
    }

    public boolean isPalindrome(long l) {
        long temp = 0;
        long temp2 = l;
        while (temp2 > 0) {
            temp += temp2 % 10;
            temp2 /= 10;
            if (temp2 > 0)
                temp *= 10;
        }
        return temp == l;
    }
    
}
