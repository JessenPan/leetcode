package org.jessenpan.leetcode.heap;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S451SortCharactersByFrequencyTest {

    private S451SortCharactersByFrequency sortCharactersByFrequency = new S451SortCharactersByFrequency();

    @Test
    public void test1() {
        String sorted = sortCharactersByFrequency.frequencySort("tree");
        Assert.assertEquals("eert", sorted);
    }

    @Test
    public void test2() {
        String sorted = sortCharactersByFrequency.frequencySort("cccaaa");
        Assert.assertEquals("cccaaa", sorted);
    }

    @Test
    public void test3() {
        String sorted = sortCharactersByFrequency.frequencySort("Aabb");
        Assert.assertEquals("bbAa", sorted);
    }

}
