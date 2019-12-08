package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S1071GreatestCommonDivisorOfStrings {

    public static int gcdInt(int a, int b) {
        int big = Math.max(a, b);
        int small = Math.min(a, b);
        if (big % small == 0) {
            return small;
        }
        return gcdInt(big % small, small);
    }

    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 >= len2) {//判断是否为含有公共因子的字符串，如果为无关字符串直接返回“”
            if (!str1.substring(0, len2).equals(str2)) {
                return "";
            }
        } else {
            if (!str1.equals(str2.substring(0, len1))) {
                return "";
            }
        }
        StringBuilder str = new StringBuilder();
        int pop;

        if (len1 == len2) {
            return str1;
        } else {//长度不等，寻找最大公因数，然后取最大公因数个数的字符组成字符串即可
            pop = gcdInt(len1, len2);
            for (int i = 0; i < pop; i++) {
                str.append(str2.charAt(i));
            }
        }

        StringBuilder repeat = new StringBuilder(str.toString());
        int len = Math.max(str1.length(), str2.length());
        while (repeat.length() <= len) {
            if (repeat.length() == str1.length()) {
                if (!repeat.toString().equals(str1)) {
                    return "";
                }
            }
            if (repeat.length() == str2.length()) {
                if (!repeat.toString().equals(str2)) {
                    return "";
                }
            }
            repeat.append(repeat.toString());
        }
        return str.toString();
    }

}
