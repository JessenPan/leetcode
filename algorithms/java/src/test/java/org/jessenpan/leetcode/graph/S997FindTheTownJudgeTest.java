package org.jessenpan.leetcode.graph;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S997FindTheTownJudgeTest {

    private S997FindTheTownJudge findTheTownJudge = new S997FindTheTownJudge();

    @Test
    public void test1() {
        int t = findTheTownJudge.findJudge(2, new int[][] { { 1, 2 } });
        Assert.assertEquals(2, t);
    }

    @Test
    public void test2() {
        int t = findTheTownJudge.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 } });
        Assert.assertEquals(3, t);
    }

    @Test
    public void test3() {
        int t = findTheTownJudge.findJudge(3, new int[][] { { 1, 3 }, { 2, 3 }, { 3, 1 } });
        Assert.assertEquals(-1, t);
    }

    @Test
    public void test4() {
        int t = findTheTownJudge.findJudge(3, new int[][] { { 1, 2 }, { 2, 3 } });
        Assert.assertEquals(-1, t);
    }

    @Test
    public void test5() {
        int t = findTheTownJudge.findJudge(3, new int[][] { { 1, 3 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 4, 3 } });
        Assert.assertEquals(3, t);
    }

}
