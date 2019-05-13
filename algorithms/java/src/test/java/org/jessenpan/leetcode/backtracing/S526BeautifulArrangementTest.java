package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S526BeautifulArrangement;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S526BeautifulArrangementTest {

    private S526BeautifulArrangement beautifulArrangement = new S526BeautifulArrangement();

    @Test
    public void test1() {
        int count = beautifulArrangement.countArrangement(2);
        Assert.assertEquals(2, count);
    }

    @Test
    public void test2() {
        int count = beautifulArrangement.countArrangement(4);
        Assert.assertEquals(8, count);
    }

    @Test
    public void test3() {
        int count = beautifulArrangement.countArrangement(3);
        Assert.assertEquals(3, count);
    }

}
