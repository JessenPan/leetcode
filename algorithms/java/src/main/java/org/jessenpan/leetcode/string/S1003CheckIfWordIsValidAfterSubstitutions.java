package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 */
public class S1003CheckIfWordIsValidAfterSubstitutions {

    public boolean isValid(String s) {
        while (s.contains("abc")) {
            s = s.replace("abc", "");
        }
        return "".equals(s);
    }

}
