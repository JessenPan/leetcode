package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S944DeleteColumnsToMakeSortedTest {

    private S944DeleteColumnsToMakeSorted deleteColumnsToMakeSorted = new S944DeleteColumnsToMakeSorted();

    @Test
    public void test1() {
        int min = deleteColumnsToMakeSorted.minDeletionSize(new String[] { "cba", "daf", "ghi" });
        Assert.assertEquals(1, min);
    }

    @Test
    public void test2() {
        int min = deleteColumnsToMakeSorted.minDeletionSize(new String[] { "a", "b" });
        Assert.assertEquals(0, min);
    }

    @Test
    public void test3() {
        int min = deleteColumnsToMakeSorted.minDeletionSize(new String[] { "zyx", "wvu", "tsr" });
        Assert.assertEquals(3, min);
    }

}
