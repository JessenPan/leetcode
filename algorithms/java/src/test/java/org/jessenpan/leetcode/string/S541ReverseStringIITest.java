package org.jessenpan.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S541ReverseStringIITest {

    private S541ReverseStringII reverseStringII = new S541ReverseStringII();
    
    @Test
    public void test1(){
        String reverseStr = reverseStringII.reverseStr("abcdefg", 2);
        assertEquals("bacdfeg",reverseStr);
    }
    
}
