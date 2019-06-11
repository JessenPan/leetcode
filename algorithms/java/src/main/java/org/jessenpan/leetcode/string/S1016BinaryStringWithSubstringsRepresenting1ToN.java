package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:tree
 */
public class S1016BinaryStringWithSubstringsRepresenting1ToN {

    public boolean queryString(String s, int n) {
        for (Integer i = 1; i <=n ; i++) {
            if(!s.contains(Integer.toBinaryString(i))){
                return false;
            }
        }
        return true;
    }
    
    
}
