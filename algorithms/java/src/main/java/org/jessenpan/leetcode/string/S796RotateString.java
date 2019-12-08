package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S796RotateString {

    public boolean rotateString(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        int times = a.length();
        StringBuilder sb = new StringBuilder(a);
        for (int i = 0; i < times; i++) {
            char c = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(c);
            if (sb.toString().equals(b)) {
                return true;
            }
        }
        return sb.toString().equals(b);
    }

}
