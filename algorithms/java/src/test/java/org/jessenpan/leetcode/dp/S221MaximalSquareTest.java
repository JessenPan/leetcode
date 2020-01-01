package org.jessenpan.leetcode.dp;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S221MaximalSquareTest {

    private S221MaximalSquare maximalSquare = new S221MaximalSquare();
    
    @Test
    public void test1(){
        maximalSquare.maximalSquare(new char[][] { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' }, { '1', '1', '1', '1', '1' }, { '1', '0', '0', '1', '0' } });
    }

}
