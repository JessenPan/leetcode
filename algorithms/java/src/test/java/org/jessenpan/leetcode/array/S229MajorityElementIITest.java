package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S229MajorityElementIITest {

    private S229MajorityElementII majorityElementII = new S229MajorityElementII();

    @Test
    public void test1() {
        List<Integer> lists = majorityElementII.majorityElement(new int[] { 3, 2, 3 });
        Assert.assertEquals(Arrays.asList(3), lists);
    }

    @Test
    public void test2() {
        List<Integer> lists = majorityElementII.majorityElement(new int[] { 1,1,1,3,3,2,2,2 });
        Assert.assertEquals(Arrays.asList(1,2), lists);
    }

}
