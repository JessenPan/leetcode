package org.jessenpan.leetcode.math;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S119PascalTriangleIITest {

    private S119PascalTriangleII pascalTriangleII = new S119PascalTriangleII();
    
    @Test
    public void test1(){
        List<Integer> pascals = pascalTriangleII.getRow(3);
        assertEquals(asList(1, 3, 3, 1), pascals);
    }
    
}
