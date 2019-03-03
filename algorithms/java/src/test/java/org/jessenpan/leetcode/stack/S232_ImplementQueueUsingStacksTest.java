package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author jessenpan
 * @since 2019/2/25 22:42
 */
public class S232_ImplementQueueUsingStacksTest {

    private S232_ImplementQueueUsingStacks.MyQueue solution232=new S232_ImplementQueueUsingStacks.MyQueue();
    
    @Test
    public void test1(){
        solution232.push(1);
        solution232.push(2);
        assertEquals(1, solution232.peek());
        assertEquals(1,solution232.pop());
        assertFalse(solution232.empty());
    }
    
}
