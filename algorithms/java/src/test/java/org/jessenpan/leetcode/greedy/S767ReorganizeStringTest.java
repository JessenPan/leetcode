package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S767ReorganizeStringTest {

    private S767ReorganizeString reorganizeString = new S767ReorganizeString();
    
    @Test
    public void test1(){
       String str= reorganizeString.reorganizeString("aab");
        Assert.assertEquals("aba", str);
    }

    @Test
    public void test2(){
        String str= reorganizeString.reorganizeString("aaab");
        Assert.assertEquals("", str);
    }

}
