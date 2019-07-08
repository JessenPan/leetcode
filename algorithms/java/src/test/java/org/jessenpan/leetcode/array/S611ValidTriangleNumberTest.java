package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S611ValidTriangleNumberTest {

    private S611ValidTriangleNumber validTriangleNumber = new S611ValidTriangleNumber();

    @Test
    public void test1() {
        int num = validTriangleNumber.triangleNumber(new int[] { 2, 2, 3, 4 });
        Assert.assertEquals(3, num);
    }

}
