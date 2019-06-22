package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S214ShortestPalindrome {

    public String shortestPalindrome(String s) {
        if (s.equals("") || s.length() == 1) {
            return s;
        }
        int x = getFrontS(s);
        return new StringBuilder(s.substring(x + 1)).reverse().toString() + s;
    }
    //获得原字符串的最长前缀回文字符串长度
    private int getFrontS(String s) {
        int a = 0;
        for (int i = s.length() - 1; i > 0; i--) {
            if (s.charAt(a) == s.charAt(i)) {
                int b = i - 1;
                a++;
                while (a < b) {
                    if (s.charAt(a) == s.charAt(b)) {
                        a++;
                        b--;
                    }
                    else {
                        break;
                    }
                }
                if (a >= b) {
                    return i;
                }
                a = 0;
            }
        }
        return 0;
    }
    
}
