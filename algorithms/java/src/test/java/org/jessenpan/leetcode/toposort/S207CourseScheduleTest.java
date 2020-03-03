package org.jessenpan.leetcode.toposort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S207CourseScheduleTest {

    private S207CourseSchedule courseSchedule = new S207CourseSchedule();

    @Test
    public void test1() {
        boolean can = courseSchedule.canFinish(2, new int[][] { { 1, 0 } });
        Assert.assertTrue(can);
    }

    @Test
    public void test2() {
        boolean can = courseSchedule.canFinish(2, new int[][] { { 1, 0 }, { 0, 1 } });
        Assert.assertFalse(can);
    }

}
