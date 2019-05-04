package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S475HeatersTest {

    private S475Heaters heaters = new S475Heaters();

    @Test
    public void test1() {
        int radius = heaters.findRadius(new int[] { 1, 2, 3 }, new int[] { 2 });
        Assert.assertEquals(1, radius);
    }

    @Test
    public void test2() {
        int radius = heaters.findRadius(new int[] { 1, 2, 3, 4 }, new int[] { 1, 4 });
        Assert.assertEquals(1, radius);
    }

    @Test
    public void test3() {
        int radius = heaters.findRadius(new int[] { 1, 5 }, new int[] { 2 });
        Assert.assertEquals(3, radius);
    }

    @Test
    public void test4() {
        int radius = heaters.findRadius(new int[] { 282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923 }, new int[] { 823564440, 115438165, 784484492, 74243042, 114807987, 137522503, 441282327, 16531729, 823378840, 143542612 });
        Assert.assertEquals(161834419, radius);
    }

    @Test
    public void test5() {
        int radius = heaters.findRadius(new int[] { 6, 9 }, new int[] { 3, 4 });
        Assert.assertEquals(5, radius);
    }

    @Test
    public void test6() {
        int radius = heaters.findRadius(new int[] { 6, 20,29 }, new int[] { 13, 25, 30 });
        Assert.assertEquals(7, radius);
    }
}
