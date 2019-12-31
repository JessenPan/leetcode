package org.jessenpan.leetcode.array;

import org.jessenpan.leetcode.array.S295FindMedianFromDataStream.MedianFinder;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S295FindMedianFromDataStreamTest {

    @Test
    public void test1() {
        MedianFinder medianFinder = new MedianFinder();
        medianFinder.addNum(1);
        medianFinder.addNum(2);
        Assert.assertEquals(1.5, medianFinder.findMedian());
        medianFinder.addNum(3);
        Assert.assertEquals(2, medianFinder.findMedian());
    }

}
