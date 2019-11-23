package org.jessenpan.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S386LexicographicalNumbersTest {

    private S386LexicographicalNumbers lexicographicalNumbers = new S386LexicographicalNumbers();

    @Test
    public void test1() {
        List<Integer> list = lexicographicalNumbers.lexicalOrder(13);
        Assert.assertEquals(Arrays.asList(1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9), list);
    }

}
