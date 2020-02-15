package org.jessenpan.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S79LargestNumberTest {

    private S79LargestNumber largestNumber = new S79LargestNumber();

    @Test
    public void test1() {
        String str = largestNumber.largestNumber(new int[] { 10, 2 });
        Assert.assertEquals("210", str);
    }

    @Test
    public void test2() {
        String str2 = largestNumber.largestNumber(new int[] { 3, 30, 34, 5, 9 });
        Assert.assertEquals("9534330", str2);
    }

    @Test
    public void test3() {
        String str2 = largestNumber.largestNumber(new int[] { 0, 0 });
        Assert.assertEquals("0", str2);
    }

}
