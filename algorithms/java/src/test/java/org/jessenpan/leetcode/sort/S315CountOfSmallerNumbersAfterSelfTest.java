package org.jessenpan.leetcode.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S315CountOfSmallerNumbersAfterSelfTest {

    private S315CountOfSmallerNumbersAfterSelf countOfSmallerNumbersAfterSelf = new S315CountOfSmallerNumbersAfterSelf();

    @Test
    public void test1() {
        List<Integer> rs = countOfSmallerNumbersAfterSelf.countSmaller(new int[] { 5, 2, 6, 1 });
        Assert.assertEquals(Arrays.asList(2, 1, 1, 0), rs);
    }

}
