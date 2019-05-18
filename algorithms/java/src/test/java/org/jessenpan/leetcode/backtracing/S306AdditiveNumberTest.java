package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S306AdditiveNumber;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S306AdditiveNumberTest {

    private S306AdditiveNumber additiveNumber = new S306AdditiveNumber();

    @Test
    public void test1() {
        boolean isAdditive = additiveNumber.isAdditiveNumber("112358");
        Assert.assertTrue(isAdditive);
    }

    @Test
    public void test2() {
        boolean isAdditive = additiveNumber.isAdditiveNumber("199100199");
        Assert.assertTrue(isAdditive);
    }

    @Test
    public void test3() {
        boolean isAdditive = additiveNumber.isAdditiveNumber("1023");
        Assert.assertFalse(isAdditive);
    }

    @Test
    public void test4() {
        boolean isAdditive = additiveNumber.isAdditiveNumber("198019823962");
        Assert.assertTrue(isAdditive);
    }

}
