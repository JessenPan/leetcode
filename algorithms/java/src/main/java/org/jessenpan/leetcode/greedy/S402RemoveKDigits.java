package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S402RemoveKDigits {

    public String removeKdigits(String num, int k) {
        if (k <= 0) {
            return num;
        }
        if (num.length() == 0 || k >= num.length()) {
            return "0";
        }
        int digits = num.length() - k;// 输出字符串的长度
        char[] stk = new char[num.length()];// 模拟桟
        int top = 0;// 记录栈顶元素的下一个位置

        for (int i = 0; i < num.length(); i++) {// 遍历所有元素
            char c = num.charAt(i);
            while (top > 0 && stk[top - 1] > c && k > 0) {// 如果当前元素比栈顶元素小，则出栈
                top--;
                k--;
            }
            stk[top++] = c; // 将当前元素压桟
        }
        // 从头开始查找头个不为0的元素位置
        int idx = 0;
        while (idx < digits && stk[idx] == '0') {
            idx++;
        }
        return idx == digits ? "0" : new String(stk, idx, digits - idx); //如果0的长度=所需长度（即剩下的都是0）则输出0，否则输出前digits长度的字符串
    }

}
