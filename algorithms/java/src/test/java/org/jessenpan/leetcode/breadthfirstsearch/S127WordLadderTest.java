package org.jessenpan.leetcode.breadthfirstsearch;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S127WordLadderTest {

    private S127WordLadder wordLadder = new S127WordLadder();

    @Test
    public void test1() {
        int v = wordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
        Assert.assertEquals(5, v);
    }

    @Test
    public void test2() {
        int v = wordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log"));
        Assert.assertEquals(0, v);
    }

}
