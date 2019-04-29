package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author jessenpan
 */
public class S448FindAllNumbersDisappearedInAnArrayTest {

    private S448FindAllNumbersDisappearedInAnArray findAllNumbersDisappearedInAnArray = new S448FindAllNumbersDisappearedInAnArray();

    @Test
    public void test1() {
        List<Integer> disappeared = findAllNumbersDisappearedInAnArray.findDisappearedNumbers(new int[] {1,2,3,2,3,6,7,8});
        Assert.assertEquals(asList(4,5),disappeared);
    }

}
