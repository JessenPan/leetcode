package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S134GasStationTest {

    private S134GasStation gasStation = new S134GasStation();

    @Test
    public void test1() {
        int sum = gasStation.canCompleteCircuit(new int[] { 1, 2, 3, 4, 5 }, new int[] { 3, 4, 5, 1, 2 });
        Assert.assertEquals(3, sum);
    }

    @Test
    public void test2() {
        int sum = gasStation.canCompleteCircuit(new int[] { 2, 3, 4 }, new int[] { 3, 4, 3 });
        Assert.assertEquals(-1, sum);
    }

}
