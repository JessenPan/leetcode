package org.jessenpan.leetcode.bit;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S260SingleNumberIIITest {

    private S260SingleNumberIII s260SingleNumberIII = new S260SingleNumberIII();

    @Test
    public void test1() {
        int[] nums = s260SingleNumberIII.singleNumber(new int[] { 1, 2, 1, 3, 2, 5 });
        System.out.println(Arrays.toString(nums));
    }

}
