package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:string
 */
public class S415AddStrings {

    public String addStrings(String num1, String num2) {

        int lengthOfNum1 = num1.length(), lengthOfNum2 = num2.length();
        int carry = 0, num1Index = lengthOfNum1 - 1, num2Index = lengthOfNum2 - 1;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        while (num1Index >= 0 || num2Index >= 0 || carry == 1) {
            if (num1Index >= 0) {
                sum += (num1.charAt(num1Index) - '0');
                num1Index--;
            }
            if (num2Index >= 0) {
                sum += (num2.charAt(num2Index) - '0');
                num2Index--;
            }

            sum += carry;
            if (sum > 9) {
                sum -= 10;
                carry = 1;
            } else {
                carry = 0;
            }
            sb.append(sum);
            sum = 0;
        }
        return sb.reverse().toString();
    }
}
