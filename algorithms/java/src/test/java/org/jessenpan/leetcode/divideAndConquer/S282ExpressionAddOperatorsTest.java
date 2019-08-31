package org.jessenpan.leetcode.divideAndConquer;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 */
public class S282ExpressionAddOperatorsTest {

    private S282ExpressionAddOperators expressionAddOperators = new S282ExpressionAddOperators();

    @Test
    public void test1() {
        List<String> list = expressionAddOperators.addOperators("123", 6);
        Assert.assertEquals(Arrays.asList("1+2+3", "1*2*3"), list);
    }

    @Test
    public void test2() {
        List<String> list = expressionAddOperators.addOperators("232", 8);
        Assert.assertEquals(Arrays.asList("2*3+2", "2+3*2"), list);
    }

    @Test
    public void test3() {
        List<String> list = expressionAddOperators.addOperators("105", 5);
        Assert.assertEquals(Arrays.asList("1*0+5", "10-5"), list);
    }

    @Test
    public void test4() {
        List<String> list = expressionAddOperators.addOperators("00", 0);
        Assert.assertEquals(Arrays.asList("0+0", "0-0", "0*0"), list);
    }

    @Test
    public void test5() {
        List<String> list = expressionAddOperators.addOperators("3456237490", 9191);
        Assert.assertEquals(Collections.emptyList(), list);
    }

}
