package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S371SumOfTwoIntegers {

    public int getSum(int a, int b) {
        int sum=a^b;
        int carry = (a & b) << 1;
        if(carry!=0){
            return getSum(sum,carry);
        }
        return sum;
    }

}
