package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.jessenpan.leetcode.stack.S895MaximumFrequencyStack.*;

/**
 * @author jessenpan
 */
public class S895MaximumFrequencyStackTest {
    
    @Test
    public void test1(){
        FreqStack freqStack = new FreqStack();
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);
        Assert.assertEquals(5,freqStack.pop());
        Assert.assertEquals(7,freqStack.pop());
        Assert.assertEquals(5,freqStack.pop());
        Assert.assertEquals(4,freqStack.pop());
    }

}
