package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S387FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {
        int[] array = new int[26];
        int length=s.length();
        for (int i = 0; i < length; i++) {
            array[s.charAt(i)-'a']++;
        }
        for (int i = 0; i < length; i++) {
            if(array[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
