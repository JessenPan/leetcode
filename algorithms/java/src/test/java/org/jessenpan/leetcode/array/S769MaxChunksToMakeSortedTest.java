package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S769MaxChunksToMakeSortedTest {

    private S769MaxChunksToMakeSorted maxChunksToMakeSorted = new S769MaxChunksToMakeSorted();

    @Test
    public void test1() {
        int chunks = maxChunksToMakeSorted.maxChunksToSorted(new int[] { 4, 3, 2, 1, 0 });
        Assert.assertEquals(1, chunks);
    }

    @Test
    public void test2() {
        int chunks = maxChunksToMakeSorted.maxChunksToSorted(new int[] { 1, 0, 2, 3, 4 });
        Assert.assertEquals(4, chunks);
    }

    @Test
    public void test3() {
        int chunks = maxChunksToMakeSorted.maxChunksToSorted(new int[] { 1, 2, 0, 3 });
        Assert.assertEquals(2, chunks);
    }

}
