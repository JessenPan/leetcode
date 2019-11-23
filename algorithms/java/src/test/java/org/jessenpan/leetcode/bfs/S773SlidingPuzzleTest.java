package org.jessenpan.leetcode.bfs;

import org.jessenpan.leetcode.depthfirstsearch.S773SlidingPuzzle;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S773SlidingPuzzleTest {

    private S773SlidingPuzzle slidingPuzzle = new S773SlidingPuzzle();

    @Test
    public void test1() {
      int t=  slidingPuzzle.slidingPuzzle(new int[][] { { 1, 2, 3 }, { 4, 0, 5 } });
        Assert.assertEquals(1,t);
    }

    @Test
    public void test2() {
        int t=  slidingPuzzle.slidingPuzzle(new int[][] { { 1, 2, 3 }, { 5,4,0 } });
        Assert.assertEquals(-1,t);
    }

    @Test
    public void test3() {
        int t=  slidingPuzzle.slidingPuzzle(new int[][] { {4, 1, 2 }, { 5,0,3 } });
        Assert.assertEquals(5,t);
    }

    @Test
    public void test4() {
        int t=  slidingPuzzle.slidingPuzzle(new int[][] { {3,2,4 }, { 1,5,0 } });
        Assert.assertEquals(14,t);
    }

}
