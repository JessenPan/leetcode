package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S89GrayCode;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S89GrayCodeTest {

    private S89GrayCode grayCode = new S89GrayCode();

    @Test
    public void test1() {
        List<Integer> grayCodes = grayCode.grayCode(2);
        Assert.assertEquals(Arrays.asList(0, 1, 3, 2), grayCodes);
    }

    @Test
    public void test2() {
        List<Integer> grayCodes = grayCode.grayCode(3);
        Assert.assertEquals(Arrays.asList(0, 1, 3, 2), grayCodes);
    }

    @Test
    public void test3() {
        List<Integer> grayCodes = grayCode.grayCode(1);
        Assert.assertEquals(Arrays.asList(0, 1), grayCodes);
    }
}
