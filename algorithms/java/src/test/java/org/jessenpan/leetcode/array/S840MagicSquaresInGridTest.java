package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S840MagicSquaresInGridTest {

    private S840MagicSquaresInGrid magicSquaresInGrid = new S840MagicSquaresInGrid();
    
    @Test
    public void test1(){
        int count = magicSquaresInGrid.numMagicSquaresInside(new int[][] { { 4, 3, 8, 4 }, { 9, 5, 1, 9 }, { 2, 7, 6, 2 } });
        assertEquals(1,count);
    }

}
