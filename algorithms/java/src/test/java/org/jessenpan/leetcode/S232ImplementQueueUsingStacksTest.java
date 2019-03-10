package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author jessenpan
 */
public class S232ImplementQueueUsingStacksTest {

    private S232ImplementQueueUsingStacks.MyQueue solution232=new S232ImplementQueueUsingStacks.MyQueue();
    
    @Test
    public void test1(){
        solution232.push(1);
        solution232.push(2);
        assertEquals(1, solution232.peek());
        assertEquals(1,solution232.pop());
        assertFalse(solution232.empty());
    }
    
}
