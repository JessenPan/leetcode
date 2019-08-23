package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1006ClumsyFactorialTest {

    private S1006ClumsyFactorial clumsyFactorial = new S1006ClumsyFactorial();

    @Test
    public void test1() {
        int v = clumsyFactorial.clumsy(4);
        Assert.assertEquals(7, v);
    }

    @Test
    public void test2() {
        int v = clumsyFactorial.clumsy(10);
        Assert.assertEquals(12, v);
    }

}
