package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1103DistributeCandiesToPeopleTest {

    private S1103DistributeCandiesToPeople distributeCandiesToPeople = new S1103DistributeCandiesToPeople();

    @Test
    public void test1() {
        int[] array = distributeCandiesToPeople.distributeCandies(7, 4);
        Assert.assertArrayEquals(new int[] { 1, 2, 3, 1 }, array);
    }

    @Test
    public void test2() {
        int[] array = distributeCandiesToPeople.distributeCandies(10, 3);
        Assert.assertArrayEquals(new int[] { 5, 2, 3 }, array);
    }

    @Test
    public void test3() {
        int[] array = distributeCandiesToPeople.distributeCandies(60, 4);
        Assert.assertArrayEquals(new int[] { 15, 18, 15,12 }, array);
    }

}
