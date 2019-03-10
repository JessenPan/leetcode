package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:stack
 */
public class S496NextGreaterElementI {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] result = new int[nums1.length];

        int lengthOfNums1 = nums1.length;
        boolean hasFoundNumInNums2 = false, hasFoundGreaterNum = false;
        for (int i = 0; i < lengthOfNums1; i++) {
            int numOfNums1 = nums1[i];
            for (int numOfNums2 : nums2) {
                if (!hasFoundNumInNums2) {
                    if (numOfNums2 == numOfNums1) {
                        hasFoundNumInNums2 = true;
                    }
                } else if (numOfNums2 > numOfNums1) {
                    result[i] = numOfNums2;
                    hasFoundGreaterNum = true;
                    break;
                }
            }
            if (!hasFoundGreaterNum) {
                result[i] = -1;
            }
            hasFoundGreaterNum = false;
            hasFoundNumInNums2 = false;
        }
        return result;
    }

}
