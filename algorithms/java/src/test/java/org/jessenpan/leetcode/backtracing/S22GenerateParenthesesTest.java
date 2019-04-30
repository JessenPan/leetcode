package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S22GenerateParentheses;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S22GenerateParenthesesTest {

    private S22GenerateParentheses generateParentheses = new S22GenerateParentheses();
    
    @Test
    public void test1(){
        List<String> expert = asList("((()))", "(()())", "(())()", "()(())", "()()()");
        assertEquals(expert, generateParentheses.generateParenthesis(3));
    }
    
}
