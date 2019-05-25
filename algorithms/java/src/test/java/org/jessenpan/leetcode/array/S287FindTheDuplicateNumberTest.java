package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S287FindTheDuplicateNumberTest {

    private S287FindTheDuplicateNumber findTheDuplicateNumber = new S287FindTheDuplicateNumber();

    @Test
    public void test1() {
        int duplicate = findTheDuplicateNumber.findDuplicate(new int[] { 1, 3, 4, 2, 2 });
        Assert.assertEquals(2, duplicate);
    }

    @Test
    public void test2() {
        int duplicate = findTheDuplicateNumber.findDuplicate(new int[] { 3, 1, 3, 4, 2 });
        Assert.assertEquals(3, duplicate);
    }

}
