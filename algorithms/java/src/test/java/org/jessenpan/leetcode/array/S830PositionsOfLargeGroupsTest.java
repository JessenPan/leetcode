package org.jessenpan.leetcode.array;

import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S830PositionsOfLargeGroupsTest {

    private S830PositionsOfLargeGroups positionsOfLargeGroups = new S830PositionsOfLargeGroups();

    @Test
    public void test1() {
        List<List<Integer>> positionGroup = positionsOfLargeGroups.largeGroupPositions("abbxxxxzzy");
    }

    @Test
    public void test2() {
        List<List<Integer>> positionGroup = positionsOfLargeGroups.largeGroupPositions("abc");
    }

    @Test
    public void test3() {
        List<List<Integer>> positionGroup = positionsOfLargeGroups.largeGroupPositions("abcdddeeeeaabbbcd");
    }

    @Test
    public void test4() {
        List<List<Integer>> positionGroup = positionsOfLargeGroups.largeGroupPositions("aaa");
    }

}
