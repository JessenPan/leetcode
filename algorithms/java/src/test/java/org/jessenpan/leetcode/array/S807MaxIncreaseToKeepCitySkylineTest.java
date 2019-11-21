package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S807MaxIncreaseToKeepCitySkylineTest {

    private S807MaxIncreaseToKeepCitySkyline maxIncreaseToKeepCitySkyline = new S807MaxIncreaseToKeepCitySkyline();

    @Test
    public void test1() {
        int t = maxIncreaseToKeepCitySkyline.maxIncreaseKeepingSkyline(new int[][] { { 3, 0, 8, 4 }, { 2, 4, 5, 7 }, { 9, 2, 6, 3 }, { 0, 3, 1, 0 } });
        Assert.assertEquals(35, t);
    }

}
