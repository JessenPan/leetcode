package org.jessenpan.leetcode.heap;

import org.junit.Test;

import static org.jessenpan.leetcode.heap.S703KthLargestElementInAStream.*;

/**
 * @author jessenpan
 */
public class S703KthLargestElementInAStreamTest {

    @Test
    public void test1() {
        KthLargest kthLargest = new KthLargest(3, new int[] { 4, 5, 8, 2 });
        kthLargest.add(3);
    }

}
