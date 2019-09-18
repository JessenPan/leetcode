package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S85MaximalRectangleTest {

    private S85MaximalRectangle maximalRectangle = new S85MaximalRectangle();

    @Test
    public void test1() {
        int max = maximalRectangle.maximalRectangle(new char[][] { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' }, { '1', '0', '0', '1', '0' } });
        Assert.assertEquals(6, max);
    }

}
