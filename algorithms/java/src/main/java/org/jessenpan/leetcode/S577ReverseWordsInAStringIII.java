package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:string
 */
public class S577ReverseWordsInAStringIII {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        int lengthOfWords=words.length;
        StringBuilder reversedStr=new StringBuilder();
        for (int i = 0; i < lengthOfWords; i++) {
            StringBuilder wordSb = new StringBuilder(words[i]);
            reversedStr.append(wordSb.reverse());
            if(i!=(lengthOfWords-1)){
                reversedStr.append(" ");
            }
        }
        return reversedStr.toString();
    }
}
