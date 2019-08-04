package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S881BoatsToSavePeopleTest {

    private S881BoatsToSavePeople boatsToSavePeople = new S881BoatsToSavePeople();

    @Test
    public void test1() {
        int n = boatsToSavePeople.numRescueBoats(new int[] { 1, 2 }, 3);
        Assert.assertEquals(1, n);
    }

    @Test
    public void test2() {
        int n = boatsToSavePeople.numRescueBoats(new int[] { 1, 2 }, 3);
        Assert.assertEquals(1, n);
    }

    @Test
    public void test3() {
        int n = boatsToSavePeople.numRescueBoats(new int[] { 3, 5, 3, 4 }, 5);
        Assert.assertEquals(4, n);
    }

    @Test
    public void test4() {
        int n = boatsToSavePeople.numRescueBoats(new int[] { 3, 2, 3, 2, 2 }, 6);
        Assert.assertEquals(3, n);
    }

    @Test
    public void test5() {
        int n = boatsToSavePeople.numRescueBoats(new int[] { 2, 49, 10, 7, 11, 41, 47, 2, 22, 6, 13, 12, 33, 18, 10, 26, 2, 6, 50, 10 }, 50);
        Assert.assertEquals(11, n);
    }

}
