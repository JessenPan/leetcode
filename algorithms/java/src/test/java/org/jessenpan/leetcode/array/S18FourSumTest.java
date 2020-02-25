package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author jessenpan
 */
public class S18FourSumTest {

    private S18FourSum fourSum = new S18FourSum();

    @Test
    public void test1() {
        List<List<Integer>> lists = fourSum.fourSum(new int[] { -3, -2, -1, 0, 0, 1, 2, 3 }, 0);
        List<List<Integer>> expected = asList(asList(-3, -2, 2, 3), asList(-3, -1, 1, 3), asList(-3, 0, 0, 3), asList(-3, 0, 1, 2), asList(-2, -1, 0, 3), asList(-2, -1, 1, 2), asList(-2, 0, 0, 2), asList(-1, 0, 0, 1));
        Assert.assertEquals(expected, lists);
        System.out.println(lists);
    }

    @Test
    public void test2() {
        List<List<Integer>> lists = fourSum.fourSum(new int[] { -499, -486, -479, -462, -456, -430, -415, -413, -399, -381, -353, -349, -342, -337, -336, -331, -330, -322, -315, -280, -271, -265, -249, -231, -226, -219, -216, -208, -206, -204, -188, -159, -144, -139, -123, -115, -99, -89, -80, -74, -61, -22, -22, -8, -5, 4, 43, 65, 82, 86, 95, 101, 103, 123, 149, 152, 162, 165, 168, 183, 204, 209, 209, 220, 235, 243, 243, 244, 248, 253, 260, 273, 281, 284, 288, 290, 346, 378, 382, 384, 407, 411, 423, 432, 433, 445, 470, 476, 497 }, 3032);
        System.out.println(lists);
    }

    @Test
    public void test3() {
        List<List<Integer>> lists = fourSum.fourSum(new int[] { 0, 0, 0, 0 }, 0);
        List<List<Integer>> expected = asList(asList(0, 0, 0, 0));
        Assert.assertEquals(expected, lists);
        System.out.println(lists);
    }

    @Test
    public void test4() {
        List<List<Integer>> lists = fourSum.fourSum(new int[] { 1, -2, -5, -4, -3, 3, 3, 5 }, -11);
        List<List<Integer>> expected = asList(asList(-5, -4, -3, 1));
        Assert.assertEquals(expected, lists);
        System.out.println(lists);
    }

    @Test
    public void test5() {
        List<List<Integer>> lists = fourSum.fourSum(new int[] { -497, -481, -481, -472, -471, -465, -422, -420, -413, -405, -388, -381, -366, -361, -359, -348, -334, -334, -318, -310, -305, -280, -273, -272, -262, -254, -248, -223, -208, -202, -196, -192, -189, -167, -165, -165, -156, -143, -136, -122, -120, -120, -108, -77, -50, -44, -34, -26, -17, -5, 13, 46, 46, 53, 54, 56, 66, 71, 72, 75, 89, 115, 130, 139, 149, 151, 154, 196, 209, 219, 230, 240, 245, 246, 253, 267, 277, 289, 299, 302, 303, 304, 342, 349, 360, 361, 361, 375, 392, 400, 407, 408, 408, 426, 427, 429, 443, 451, 481 }, -5617);
        List<List<Integer>> expected = asList(asList(-5, -4, -3, 1));
        Assert.assertEquals(expected, lists);
        System.out.println(lists);
    }

}
