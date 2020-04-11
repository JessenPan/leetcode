package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S757SetIntersectionSizeAtLeastTwoTest {

    private S757SetIntersectionSizeAtLeastTwo setIntersectionSizeAtLeastTwo = new S757SetIntersectionSizeAtLeastTwo();

    @Test
    public void test1() {
        int t = setIntersectionSizeAtLeastTwo.intersectionSizeTwo(new int[][] { { 1, 3 }, { 1, 4 }, { 2, 5 }, { 3, 5 } });
        Assert.assertEquals(3, t);
    }

    @Test
    public void test2() {
        int t = setIntersectionSizeAtLeastTwo.intersectionSizeTwo(new int[][] { { 1, 2 }, { 2, 3 }, { 2, 4 }, { 4, 5 } });
        Assert.assertEquals(5, t);
    }

}
