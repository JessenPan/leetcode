package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S775GlobalAndLocalInversions {

    //TODO 
    public boolean isIdealPermutation(int[] a) {

        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (Math.abs(a[i] - i) > 1) {
                return false;
            }
        }
        return true;
    }

}
