package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.array.S900RleIterator.*;

/**
 * @author jessenpan
 */
public class S900RleIteratorTest {

    @Test
    public void test1() {
        RLEIterator rleIterator = new RLEIterator(new int[] { 3, 8, 0, 9, 2, 5 });

        Assert.assertEquals(8, rleIterator.next(2));
        Assert.assertEquals(8, rleIterator.next(1));
        Assert.assertEquals(5, rleIterator.next(1));
        Assert.assertEquals(-1, rleIterator.next(2));
    }

}
