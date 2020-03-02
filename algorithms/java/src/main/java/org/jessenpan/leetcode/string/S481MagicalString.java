package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S481MagicalString {

    public int magicalString(int n) {

        if (n == 0) {
            return 0;
        }
        if (n <= 3) {
            return 1;
        }
        StringBuilder sb = new StringBuilder("122");
        int len = sb.length(), i = 2;
        char lastChar = '2';
        while (len < n) {
            if (sb.charAt(i) == '2') {
                //表示要放两个元素
                if (lastChar == '1') {
                    sb.append("22");
                    lastChar = '2';
                } else {
                    sb.append("11");
                    lastChar = '1';
                }
            } else {
                //表示要放一个元素
                if (lastChar == '1') {
                    sb.append("2");
                    lastChar = '2';
                } else {
                    sb.append("1");
                    lastChar = '1';
                }
            }
            i++;
            len = sb.length();
        }
        int sumOfOne = 0;
        for (int j = 0; j < n; j++) {
            if (sb.charAt(j) == '1') {
                sumOfOne++;
            }
        }
        return sumOfOne;
    }

}
