package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S556NextGreaterElementIIITest {

    private S556NextGreaterElementIII nextGreaterElementIII = new S556NextGreaterElementIII();
    
    @Test
    public void test1(){
        int element = nextGreaterElementIII.nextGreaterElement(12);
        Assert.assertEquals(21,element);
    }


    @Test
    public void test2(){
        int element = nextGreaterElementIII.nextGreaterElement(21);
        Assert.assertEquals(-1,element);
    }
}
