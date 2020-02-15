package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

/**
 * @author jessenpan
 */
public class S770BasicCalculatorIVTest {

    private S770BasicCalculatorIV basicCalculatorIV = new S770BasicCalculatorIV();

    @Test
    public void test1() {
        List<String> rst = basicCalculatorIV.basicCalculatorIV("e + 8 - a + 5", new String[] { "e" }, new int[] { 1 });
        Assert.assertEquals(asList("-1*a", "14"), rst);
    }

    @Test
    public void test2() {
        List<String> rst = basicCalculatorIV.basicCalculatorIV("e - 8 + temperature - pressure", new String[] { "e", "temperature" }, new int[] { 1, 12 });
        Assert.assertEquals(asList("-1*pressure", "5"), rst);
    }

    @Test
    public void test3() {
        List<String> rst = basicCalculatorIV.basicCalculatorIV("(e + 8) * (e - 8)", new String[] {}, new int[] {});
        Assert.assertEquals(asList("1*e*e", "-64"), rst);
    }

    @Test
    public void test4() {
        List<String> rst = basicCalculatorIV.basicCalculatorIV("7 - 7", new String[] {}, new int[] {});
        Assert.assertEquals(emptyList(), rst);
    }

    @Test
    public void test5() {
        List<String> rst = basicCalculatorIV.basicCalculatorIV("a * b * c + b * a * c * 4", new String[] {}, new int[] {});
        Assert.assertEquals(singletonList("5*a*b*c"), rst);
    }

    @Test
    public void test6() {
        List<String> rst = basicCalculatorIV.basicCalculatorIV("((a - b) * (b - c) + (c - a)) * ((a - b) + (b - c) * (c - a))", new String[] {}, new int[] {});
        Assert.assertEquals(emptyList(), rst);
    }

}
