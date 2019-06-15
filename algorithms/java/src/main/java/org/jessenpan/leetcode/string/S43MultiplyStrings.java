package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S43MultiplyStrings {

    public String multiply(String num1, String num2) {

        if ((num1.length() == 1 && num1.charAt(0) == '0') || (num2.length() == 1 && num2.charAt(0) == '0')) {
            return "0";
        }
        
        int len1 = num1.length();
        int len2 = num2.length();
        int[] array = new int[len1 + len2];

        int indexPerMulti = 0;
        int index = 0;
        for (int i = len2 - 1; i >= 0; i--) {
            int val = num2.charAt(i) - '0';
            indexPerMulti = index++;
            for (int j = len1 - 1; j >= 0; j--) {
                int r = val * (num1.charAt(j) - '0') + array[indexPerMulti];
                array[indexPerMulti] = r % 10;
                array[indexPerMulti + 1] += r / 10;
                indexPerMulti++;
            }
        }

        int lenOfArray = array.length - 1;
        boolean isFirst = true;
        StringBuilder sb = new StringBuilder();
        while (lenOfArray >= 0) {
            int val = array[lenOfArray--];
            if (val == 0 && isFirst) {
                continue;
            }
            isFirst = false;
            sb.append(val);
        }
        return sb.toString();
    }

}
