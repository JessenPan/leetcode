package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1190ReverseSubstringsBetweenEachPairOfParenthesesTest {

    private S1190ReverseSubstringsBetweenEachPairOfParentheses reverseSubstringsBetweenEachPairOfParentheses = new S1190ReverseSubstringsBetweenEachPairOfParentheses();

    @Test
    public void test1() {
        String str = reverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("(abcd)");
        Assert.assertEquals("dcba", str);
    }

    @Test
    public void test2() {
        String str = reverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("(u(love)i)");
        Assert.assertEquals("iloveu", str);
    }

    @Test
    public void test3() {
        String str = reverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("(ed(et(oc))el)");
        Assert.assertEquals("leetcode", str);
    }

    @Test
    public void test4() {
        String str = reverseSubstringsBetweenEachPairOfParentheses.reverseParentheses("a(bcdefghijkl(mno)p)q");
        Assert.assertEquals("apmnolkjihgfedcbq", str);
    }

}
