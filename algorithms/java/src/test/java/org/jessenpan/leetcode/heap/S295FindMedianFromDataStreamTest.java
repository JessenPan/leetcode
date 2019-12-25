package org.jessenpan.leetcode.heap;

import org.jessenpan.leetcode.heap.S295FindMedianFromDataStream.MedianFinder;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S295FindMedianFromDataStreamTest {

    @Test
    public void test1() {
        MedianFinder findMedianFromDataStream = new MedianFinder();
        findMedianFromDataStream.addNum(1);
        findMedianFromDataStream.addNum(2);
        Assert.assertEquals(1.5, findMedianFromDataStream.findMedian(),0);
        findMedianFromDataStream.addNum(3);
        Assert.assertEquals(2, findMedianFromDataStream.findMedian(),0);
    }

}
