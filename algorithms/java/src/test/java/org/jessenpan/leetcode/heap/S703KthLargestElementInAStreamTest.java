package org.jessenpan.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.heap.S703KthLargestElementInAStream.*;

/**
 * @author jessenpan
 */
public class S703KthLargestElementInAStreamTest {

    @Test
    public void test1() {
        KthLargest kthLargest = new KthLargest(3, new int[] { 4, 5, 8, 2 });
        int kth = 0;
        kth = kthLargest.add(3);
        Assert.assertEquals(4, kth);
        kth = kthLargest.add(5);
        Assert.assertEquals(5, kth);
        kth = kthLargest.add(10);
        Assert.assertEquals(5, kth);
        kth = kthLargest.add(9);
        Assert.assertEquals(8, kth);
        kth = kthLargest.add(4);
        Assert.assertEquals(8, kth);
    }

    @Test
    public void test2() {
        KthLargest kthLargest = new KthLargest(1, new int[] {});
        int kth = 0;
        kth = kthLargest.add(-3);
        Assert.assertEquals(-3, kth);
        kth = kthLargest.add(-2);
        Assert.assertEquals(-2, kth);
        kth = kthLargest.add(-4);
        Assert.assertEquals(-2, kth);
        kth = kthLargest.add(0);
        Assert.assertEquals(0, kth);
        kth = kthLargest.add(4);
        Assert.assertEquals(4, kth);
    }

}
