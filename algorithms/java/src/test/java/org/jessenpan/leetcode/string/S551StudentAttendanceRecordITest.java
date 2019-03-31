package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.S551StudentAttendanceRecordI;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S551StudentAttendanceRecordITest {

    private S551StudentAttendanceRecordI studentAttendanceRecordI = new S551StudentAttendanceRecordI();

    @Test
    public void test1() {
        boolean needAward = studentAttendanceRecordI.checkRecord("PPALLP");
        assertTrue(needAward);
    }

    @Test
    public void test2() {
        boolean needAward = studentAttendanceRecordI.checkRecord("PPALLL");
        assertFalse(needAward);
    }
    

}
