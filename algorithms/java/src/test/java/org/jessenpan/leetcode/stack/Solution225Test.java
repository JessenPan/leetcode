package org.jessenpan.leetcode.stack;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author jessenpan
 * @since 2019/2/28 23:57
 */
public class Solution225Test {

    @Test
    public void test1() {
        Solution225.MyStack myStack = new Solution225.MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(4);
        assertEquals(4, myStack.pop());
        assertEquals(2, myStack.pop());
        myStack.push(3);
        assertEquals(3, myStack.pop());
        assertEquals(1, myStack.top());
    }

    @Test
    public void test2() {
        Solution225.MyStack myStack = new Solution225.MyStack();
        myStack.push(1);
        assertEquals(1, myStack.top());
        assertFalse(myStack.empty());
    }

    @Test
    public void test3() {
        Solution225.MyStack myStack = new Solution225.MyStack();
        myStack.push(1);
        myStack.push(2);
        assertEquals(2, myStack.top());
        myStack.push(3);
        assertEquals(3, myStack.top());
    }

}
