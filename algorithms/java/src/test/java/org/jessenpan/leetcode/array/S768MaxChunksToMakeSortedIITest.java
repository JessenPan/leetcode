package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S768MaxChunksToMakeSortedIITest {

    private S768MaxChunksToMakeSortedII maxChunksToMakeSortedII = new S768MaxChunksToMakeSortedII();

    @Test
    public void test1() {
        int v = maxChunksToMakeSortedII.maxChunksToSorted(new int[] { 5, 4, 3, 2, 1 });
        Assert.assertEquals(1, v);
    }

    @Test
    public void test2() {
        int v = maxChunksToMakeSortedII.maxChunksToSorted(new int[] { 2, 1, 3, 4, 4 });
        Assert.assertEquals(4, v);
    }

}
