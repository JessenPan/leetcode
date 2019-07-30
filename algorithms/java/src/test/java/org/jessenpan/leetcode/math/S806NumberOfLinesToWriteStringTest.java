package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S806NumberOfLinesToWriteStringTest {

    private S806NumberOfLinesToWriteString numberOfLinesToWriteString = new S806NumberOfLinesToWriteString();

    @Test
    public void test1() {
        int[] nums = numberOfLinesToWriteString.numberOfLines(new int[] { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, "abcdefghijklmnopqrstuvwxyz");
        Assert.assertArrayEquals(new int[] { 3, 60 }, nums);
    }

    @Test
    public void test2() {
        int[] nums = numberOfLinesToWriteString.numberOfLines(new int[] { 4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10 }, "bbbcccdddaaa");
        Assert.assertArrayEquals(new int[] { 2, 4 }, nums);
    }

}
