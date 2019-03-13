package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:string
 */
public class S709ToLowerCase {

    public String toLowerCase(String str) {
        int lengthOfStr=str.length();
        StringBuilder lowerCaseStr = new StringBuilder();
        for (int i = 0; i < lengthOfStr; i++) {
            char charAtIndex = str.charAt(i);
            if(charAtIndex>='A'&&charAtIndex<='Z'){
                lowerCaseStr.append((char) (charAtIndex + 32));
            }else{
                lowerCaseStr.append(charAtIndex);
            }
        }
        return lowerCaseStr.toString();
    }
}
