package org.jessenpan.leetcode.toposort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S210CourseScheduleIITest {

    private S210CourseScheduleII courseScheduleII = new S210CourseScheduleII();

    @Test
    public void test1() {
        int[] courses = courseScheduleII.findOrder(2, new int[][] { { 1, 0 } });
        Assert.assertArrayEquals(new int[] { 0, 1 }, courses);
    }

    @Test
    public void test2() {
        int[] courses = courseScheduleII.findOrder(4, new int[][] { { 1, 0 }, { 2, 0 }, { 3, 1 }, { 3, 2 } });
        Assert.assertArrayEquals(new int[] { 0, 1, 2, 3 }, courses);
    }

}
