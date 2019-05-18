package org.jessenpan.leetcode.backtracking;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S306AdditiveNumber {

    //判断strOne + strTwo的结果是否在curStr的起始位置
    private boolean myAdd(String strOne, String strTwo, String curStr) {
        if ("".equals(curStr)) {
            return false;
        }
        String strThree = String.valueOf(Long.parseLong(strOne) + Long.parseLong(strTwo));//将第一个串、第二个串转换为长整型，相加，再转换成字符串三
        if (strThree.length() > curStr.length()) {
            return false;
        }
        String curStartStr = curStr.substring(0, strThree.length());//寻找curStr中的起始字符串
        if (strThree.equals(curStartStr)) {//判断是否相等
            String nowCurStr = curStr.substring(strThree.length());
            if (nowCurStr.length() > 0) {//如果curStr去除strThree还未到达尾端
                return myAdd(strTwo, strThree, nowCurStr);//更新前两个字符串，继续计算寻找
            } else {
                return true;//到达了尾端，就直接返回true
            }
        } else {
            return false;
        }

    }

    public boolean isAdditiveNumber(String num) {
        if (num.length() < 3) {
            return false;
        }
        int numLen = num.length();
        //第一层for确定第一个字符串的尾端
        for (int firstEnd = 1; firstEnd < numLen - 1; ++firstEnd) {
            //剪枝  字符串1不能出现“023”这种
            if (num.charAt(0) == '0' && firstEnd > 1) {
                break;
            }
            //第二层for寻转确定第二个字符串的尾端
            for (int secondEnd = firstEnd + 1; secondEnd < numLen; ++secondEnd) {
                if (num.charAt(firstEnd) == '0' && secondEnd - firstEnd > 1) {//剪枝  字符串2不能出现“023”这种
                    break;
                }
                String strOne = num.substring(0, firstEnd);//第一个字符串
                String strTwo = num.substring(firstEnd, secondEnd);//第二个字符串
                String curStr = num.substring(secondEnd);//num去除第一、第二个字符串剩余的字符串
                if (myAdd(strOne, strTwo, curStr)) {//如果成功，则退出
                    return true;
                }
            }
        }
        return false;
    }

}
