package org.jessenpan.leetcode.binarysearch;

/**
 * @author jessenpan
 * tag:binarysearch
 */
public class S540SingleElementInASortedArray {

    public int singleNonDuplicate(int[] nums) {
        int l=0,r=nums.length-1;
        while(l<r){
            int h=(r+l)/2;
            if(h%2==1){
                if(nums[h]==nums[h+1])
                    r=h-1;
                else
                    l=h+1;
            }else{
                if(nums[h]==nums[h+1])
                    l=h+2;
                else
                    r=h;
            }
        }
        return nums[l];
    }

}
