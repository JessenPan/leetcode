package org.jessenpan.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S274HIndexTest {

    private S274HIndex hIndex = new S274HIndex();

    @Test
    public void test1() {
        int cnt = hIndex.hIndex(new int[] { 3, 0, 6, 1, 5 });
        Assert.assertEquals(3, cnt);
    }

    @Test
    public void test2() {
        int cnt = hIndex.hIndex(new int[] { 1 });
        Assert.assertEquals(1, cnt);
    }

}
