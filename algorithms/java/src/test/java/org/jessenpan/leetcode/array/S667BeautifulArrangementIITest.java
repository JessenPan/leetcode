package org.jessenpan.leetcode.array;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S667BeautifulArrangementIITest {

    private S667BeautifulArrangementII beautifulArrangementII = new S667BeautifulArrangementII();

    @Test
    public void test1() {
        int[] array = beautifulArrangementII.constructArray(50, 20);
        System.out.println(Arrays.toString(array));
    }

}
