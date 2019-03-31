package org.jessenpan.leetcode.array;

import org.jessenpan.leetcode.S561ArrayPartitionI;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S561ArrayPartitionITest {

    private S561ArrayPartitionI arrayPartitionI = new S561ArrayPartitionI();

    @Test
    public void test1() {
        int result = arrayPartitionI.arrayPairSum(new int[] { 1, 4, 3, 2 });
        assertEquals(4, result);
    }

}
