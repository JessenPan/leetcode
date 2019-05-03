package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S849MaximizeDistanceToClosestPersonTest {

    private S849MaximizeDistanceToClosestPerson maximizeDistanceToClosestPerson = new S849MaximizeDistanceToClosestPerson();

    @Test
    public void test1() {
        int max = maximizeDistanceToClosestPerson.maxDistToClosest(new int[] { 1, 0, 0, 0, 1, 0, 1 });
        assertEquals(2, max);
    }

    @Test
    public void test2() {
        int max = maximizeDistanceToClosestPerson.maxDistToClosest(new int[] { 1, 0, 0, 0 });
        assertEquals(3, max);
    }

    @Test
    public void test3() {
        int max = maximizeDistanceToClosestPerson.maxDistToClosest(new int[] { 0, 0, 0, 1 });
        assertEquals(3, max);
    }

    @Test
    public void test4() {
        int max = maximizeDistanceToClosestPerson.maxDistToClosest(new int[] { 0,1,0,1,0 });
        assertEquals(1, max);
    }

}
