package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S640SolveTheEquationTest {

    private S640SolveTheEquation solveTheEquation = new S640SolveTheEquation();

    @Test
    public void test1() {
        String r = solveTheEquation.solveEquation("x+5-3+x=6+x-2");
        Assert.assertEquals("x=2", r);
    }

    @Test
    public void test2() {
        String r = solveTheEquation.solveEquation("x=x");
        Assert.assertEquals("Infinite solutions", r);
    }

    @Test
    public void test3() {
        String r = solveTheEquation.solveEquation("2x=x");
        Assert.assertEquals("x=0", r);
    }

    @Test
    public void test4() {
        String r = solveTheEquation.solveEquation("2x+3x-6x=x+2");
        Assert.assertEquals("x=-1", r);
    }

    @Test
    public void test5() {
        String r = solveTheEquation.solveEquation("x=x+2");
        Assert.assertEquals("No solution", r);
    }



    @Test
    public void test6() {
        String r = solveTheEquation.solveEquation("-x=-1");
        Assert.assertEquals("x=1", r);
    }

    @Test
    public void test7() {
        String r = solveTheEquation.solveEquation("2+2-x+x+3x=x+2x-x+x+4");
        Assert.assertEquals("Infinite solutions", r);
    }
}
