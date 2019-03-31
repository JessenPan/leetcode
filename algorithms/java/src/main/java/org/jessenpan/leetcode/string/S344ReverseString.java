package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 */
public class S344ReverseString {

    public void reverseString(char[] s) {
        int loopTime = s.length / 2;
        int leftIndex=0,rightIndex=s.length-1;
        char tmp;
        for (int i = 0; i < loopTime; i++) {
            tmp=s[leftIndex];
            s[leftIndex]=s[rightIndex];
            s[rightIndex]=tmp;
            leftIndex++;
            rightIndex--;
        }
    }

}
