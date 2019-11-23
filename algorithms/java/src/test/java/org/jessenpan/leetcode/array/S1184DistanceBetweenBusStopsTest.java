package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1184DistanceBetweenBusStopsTest {

    private S1184DistanceBetweenBusStops distanceBetweenBusStops = new S1184DistanceBetweenBusStops();

    @Test
    public void test1() {
        int t = distanceBetweenBusStops.distanceBetweenBusStops(new int[] { 1, 2, 3, 4 }, 0, 1);
        Assert.assertEquals(1, t);
    }

    @Test
    public void test2() {
        int t = distanceBetweenBusStops.distanceBetweenBusStops(new int[] { 1, 2, 3, 4 }, 0, 2);
        Assert.assertEquals(3, t);
    }

    @Test
    public void test3() {
        int t = distanceBetweenBusStops.distanceBetweenBusStops(new int[] { 1, 2, 3, 4 }, 0, 3);
        Assert.assertEquals(4, t);
    }

    @Test
    public void test4() {
        int t = distanceBetweenBusStops.distanceBetweenBusStops(new int[] { 7, 10, 1, 12, 11, 14, 5, 0 }, 7, 2);
        Assert.assertEquals(17, t);
    }

}
