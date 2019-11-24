package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S1154DayOfTheYear {

    public int dayOfYear(String date) {
        
        String[] strs = date.split("-");
        int year = Integer.parseInt(strs[0]);
        int month = Integer.parseInt(strs[1]);
        int day = Integer.parseInt(strs[2]);
        int[] months = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            months[2] += 1;
        }
        int res = 0;
        for (int i = 0; i < month; i++) {
            res += months[i];
        }
        res += day;
        return res;

    }

}
