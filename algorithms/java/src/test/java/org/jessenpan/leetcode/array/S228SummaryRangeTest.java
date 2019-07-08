package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S228SummaryRangeTest {

    private S228SummaryRange summaryRange = new S228SummaryRange();

    @Test
    public void test1() {
        List<String> list = summaryRange.summaryRanges(new int[] { 0, 1, 2, 4, 5, 7 });
        Assert.assertEquals(Arrays.asList("0->2", "4->5", "7"), list);
    }

    @Test
    public void test2() {
        List<String> list = summaryRange.summaryRanges(new int[] { 0, 2, 3, 4, 6, 8, 9 });
        Assert.assertEquals(Arrays.asList("0", "2->4", "6", "8->9"), list);
    }

}
