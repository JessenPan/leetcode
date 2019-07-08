package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1011CapacityToShipPackagesWithinDdaysTest {

    private S1011CapacityToShipPackagesWithinDdays capacityToShipPackagesWithinDdays = new S1011CapacityToShipPackagesWithinDdays();

    @Test
    public void test1() {
        int capacity = capacityToShipPackagesWithinDdays.shipWithinDays(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 5);
        Assert.assertEquals(15, capacity);
    }

    @Test
    public void test2() {
        int capacity = capacityToShipPackagesWithinDdays.shipWithinDays(new int[] { 3, 2, 2, 4, 1, 4 }, 3);
        Assert.assertEquals(6, capacity);
    }

    @Test
    public void test3() {
        int capacity = capacityToShipPackagesWithinDdays.shipWithinDays(new int[] { 1, 2, 3, 1, 1 }, 4);
        Assert.assertEquals(3, capacity);
    }

}
