package org.jessenpan.leetcode.map;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S447NumberOfBoomerangsTest {

    S447NumberOfBoomerangs numberOfBoomerangs = new S447NumberOfBoomerangs();

    @Test
    public void test1() {
        int num = numberOfBoomerangs.numberOfBoomerangs(new int[][] { { 0, 0 }, { 1, 0 }, { 2, 0 } });
        assertEquals(2, num);
    }

}
