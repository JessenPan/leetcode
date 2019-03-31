package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 * //TODO lean how to inference
 */
public class S258AddDigits {
        
    public int addDigits(int num){
        if(num==0){
            return 0;
        }
        if(num%9==0){
            return 9;
        }
        
        return num%9;
    }
}
