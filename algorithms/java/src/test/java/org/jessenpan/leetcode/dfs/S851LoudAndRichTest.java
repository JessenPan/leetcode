package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S851LoudAndRichTest {

    private S851LoudAndRich loudAndRich = new S851LoudAndRich();

    @Test
    public void test1() {
        int[] peoples = loudAndRich.loudAndRich(new int[][] { { 1, 0 }, { 2, 1 }, { 3, 1 }, { 3, 7 }, { 4, 3 }, { 5, 3 }, { 6, 3 } }, new int[] { 3, 2, 5, 4, 6, 1, 7, 0 });
        Assert.assertArrayEquals(new int[] { 5, 5, 2, 5, 4, 5, 6, 7 }, peoples);
    }

}
