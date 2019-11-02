package org.jessenpan.leetcode.dynamicProgramming;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S1147LongestChunkedPalindromeDecomposition {

    private int theLongestSegment = 1;
    
    //TODO 此处使用的是回溯算法，改用动态规划进行提升(可以缓存部分结果提升效率)
    public int longestDecomposition(String text) {

        if (text == null || text.isEmpty()) {
            return 0;
        }

        findTheLongestDecomposition(text, 0);
        return theLongestSegment;
    }

    private void findTheLongestDecomposition(String text, int current) {

        if (text == null || text.isEmpty()) {
            theLongestSegment = Math.max(theLongestSegment, current);
            return;
        }

        int theStrLen = text.length();
        int halfLen = (int) Math.ceil(theStrLen / 2);
        for (int i = 0; i < halfLen; i++) {
            String left = text.substring(0, i + 1);
            String right = text.substring(theStrLen - i - 1, theStrLen);
            if (left.equals(right)) {
                findTheLongestDecomposition(text.substring(i + 1, theStrLen - i - 1), current + 2);
            }
        }
        theLongestSegment = Math.max(theLongestSegment, current + 1);
    }

}
