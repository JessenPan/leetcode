package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:string
 */
public class S551StudentAttendanceRecordI {

    private static final char ABSENT = 'A';

    private static final char LATE = 'L';

    private static final char PRESENT = 'P';

    public boolean checkRecord(String s) {
        int absentTimes = 0;
        boolean hasLateMoreThanTwice = false;
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) == ABSENT) {
                absentTimes++;
            } else if (s.charAt(i) == LATE) {
                if (i + 1 < length && i + 2 < length && s.charAt(i + 1) == LATE && s.charAt(i + 2) == LATE) {
                    hasLateMoreThanTwice = true;
                }
            }
            if (absentTimes > 1 || hasLateMoreThanTwice) {
                return false;
            }
        }
        return true;
    }
}
