package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S537ComplexNumberMultiplicationTest {

    private S537ComplexNumberMultiplication complexNumberMultiplication = new S537ComplexNumberMultiplication();
    
    @Test
    public void test1(){
        String plural = complexNumberMultiplication.complexNumberMultiply("1+1i", "1+1i");
        Assert.assertEquals("0+2i", plural);
    }

    @Test
    public void test2(){
        String plural = complexNumberMultiplication.complexNumberMultiply("1+-1i", "1+-1i");
        Assert.assertEquals("0+-2i", plural);
    }

}
