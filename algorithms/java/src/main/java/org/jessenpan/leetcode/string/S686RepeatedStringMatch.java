package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S686RepeatedStringMatch {

    //TODO study
    public int repeatedStringMatch(String A, String B) {
        int sum = A.length();
        for (int i = 0; i < 10000; i++) {
            A = A + A.charAt(i);
        }
        int number;
        int num = A.indexOf(B);
        if (num == -1)
            return -1;
        number = num + B.length();
        if (number % sum == 0)
            return number / sum;
        else
            return number / sum + 1;
    }

}
