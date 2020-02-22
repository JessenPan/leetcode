package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 */
public class S886PrimePalindrome {

    public int primePalindrome(int n) {

        int[] check = new int[] { 2, 2, 2, 3, 5, 5, 7, 7, 11, 11, 11, 11 };
        if (n < check.length) {
        return check[n];
    }

        while (true) {
        String str = String.valueOf(n);
        if ((str.length() & 1) == 0) {
            n = (int) Math.pow(10, str.length()) + 1;
            continue;
        }

        int mod = n % 6;
        if (mod != 1 && mod != 5) {
            n = (mod == 0) ? n + 1 : n + (5 - mod);
        } else {
            int up = (int) Math.sqrt(n);
            boolean notPrime = false;
            for (int i = 5; i <= up; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    notPrime = true;
                    break;
                }
            }
            if (notPrime) {
                n = stepToNextNum(n, mod);
            } else {
                boolean isPalindrome = isPalindrome(String.valueOf(n));
                if (isPalindrome) {
                    return n;
                }else {
                    n = stepToNextNum(n, mod);
                }
            }
        }
    }
}

    private int stepToNextNum(int n, int mod) {
        return (mod == 1) ? n + 4 : n + 2;
    }

    private boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
