package org.jessenpan.leetcode.bit;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S397IntegerReplacementTest {

    private S397IntegerReplacement integerReplacement = new S397IntegerReplacement();
    
    @Test
    public void test1(){
        int count = integerReplacement.integerReplacement(8);
        Assert.assertEquals(3, count);
    }

    @Test
    public void test2(){
        int count = integerReplacement.integerReplacement(7);
        Assert.assertEquals(4, count);
    }

    @Test
    public void test3(){
        int count = integerReplacement.integerReplacement(65535);
        Assert.assertEquals(17, count);
    }

    @Test
    public void test4(){
        int count = integerReplacement.integerReplacement(100000000);
        Assert.assertEquals(31, count);
    }

}
