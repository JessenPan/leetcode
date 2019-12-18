package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1175PrimeArrangementsTest {

    private S1175PrimeArrangements primeArrangements = new S1175PrimeArrangements();

    @Test
    public void test1() {
        int t = primeArrangements.numPrimeArrangements(5);
        Assert.assertEquals(12, t);
    }

    @Test
    public void test2() {
        int t = primeArrangements.numPrimeArrangements(100);
        Assert.assertEquals(682289015, t);
    }

}
