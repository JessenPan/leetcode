package org.jessenpan.leetcode;

import org.jessenpan.leetcode.array.S169MajorityElement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S169MajorityElementTest {

    private S169MajorityElement majorityElementObj = new S169MajorityElement();

    @Test
    public void test1() {
        float f = (float) (5 / 2);
        System.out.println(f);
    }

    @Test
    public void test2() {
        int majorityElement = majorityElementObj.majorityElement(new int[] { 3, 2, 3 });
        assertEquals(3, majorityElement);
    }

    @Test
    public void test3() {
        int majorityElement = majorityElementObj.majorityElement(new int[] { 2, 2, 1, 1, 1, 2, 2 });
        assertEquals(2,majorityElement);
    }
}
