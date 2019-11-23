package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S1200MinimumAbsoluteDifferenceTest {

    private S1200MinimumAbsoluteDifference minimumAbsoluteDifference = new S1200MinimumAbsoluteDifference();

    @Test
    public void test1() {
        List<List<Integer>> list = minimumAbsoluteDifference.minimumAbsDifference(new int[] { 4, 2, 1, 3 });
        Assert.assertEquals(Arrays.asList(Arrays.asList(1, 2), Arrays.asList(2, 3), Arrays.asList(3, 4)), list);
    }

    @Test
    public void test2() {
        List<List<Integer>> list = minimumAbsoluteDifference.minimumAbsDifference(new int[] { 1, 3, 6, 10, 15 });
        Assert.assertEquals(Arrays.asList(Arrays.asList(1, 3)), list);
    }

    @Test
    public void test3() {
        List<List<Integer>> list = minimumAbsoluteDifference.minimumAbsDifference(new int[] { 3, 8, -10, 23, 19, -4, -14, 27 });
        Assert.assertEquals(Arrays.asList(Arrays.asList(-14, -10), Arrays.asList(19, 23), Arrays.asList(23, 27)), list);
    }

}
