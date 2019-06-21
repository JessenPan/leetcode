package org.jessenpan.leetcode.bit;

/**
 * @author jessenpan
 * tag:bit
 */
public class S201BitwiseAndOfNumbersRange {

    public int rangeBitwiseAnd(int m, int n) {

        int  count=0;
        while(m!=n){
            m>>=1;
            n>>=1;
            count++;
        }
        return m<<count;
    }

}
