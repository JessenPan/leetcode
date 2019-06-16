package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S831MaskingPersonalInformationTest {

    private S831MaskingPersonalInformation maskingPersonalInformation = new S831MaskingPersonalInformation();

    @Test
    public void test1() {
        String mask = maskingPersonalInformation.maskPII("LeetCode@LeetCode.com");
        Assert.assertEquals("l*****e@leetcode.com", mask);
    }

    @Test
    public void test2() {
        String mask = maskingPersonalInformation.maskPII("AB@qq.com");
        Assert.assertEquals("a*****b@qq.com", mask);
    }

    @Test
    public void test3() {
        String mask = maskingPersonalInformation.maskPII("1(234)567-890");
        Assert.assertEquals("***-***-7890", mask);
    }

    @Test
    public void test4() {
        String mask = maskingPersonalInformation.maskPII("86-(10)12345678");
        Assert.assertEquals("+**-***-***-5678", mask);
    }


    @Test
    public void test5() {
        String mask = maskingPersonalInformation.maskPII("+(501321)-50-23431");
        Assert.assertEquals("+***-***-***-3431", mask);
    }

}
