package org.jessenpan.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S38CountAndSayTest {

    private S38CountAndSay countAndSay = new S38CountAndSay();
    
    @Test
    public void test1(){
        String str = countAndSay.countAndSay(1);
        assertEquals("1", str);
    }

    @Test
    public void test2(){
        String str = countAndSay.countAndSay(4);
        assertEquals("1211", str);
    }
    
}
