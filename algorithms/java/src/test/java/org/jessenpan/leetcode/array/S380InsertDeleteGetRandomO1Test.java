package org.jessenpan.leetcode.array;

import org.jessenpan.leetcode.array.S380InsertDeleteGetRandomO1.RandomizedSet;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S380InsertDeleteGetRandomO1Test {

    private RandomizedSet randomizedSet = new RandomizedSet();

    @Test
    public void test1() {
        Assert.assertTrue(randomizedSet.insert(0));
        Assert.assertTrue(randomizedSet.insert(1));
        Assert.assertTrue(randomizedSet.remove(0));
        Assert.assertTrue(randomizedSet.insert(2));
        Assert.assertTrue(randomizedSet.remove(1));
        Assert.assertEquals(2, randomizedSet.getRandom());
    }

    @Test
    public void test2() {
        Assert.assertTrue(randomizedSet.insert(0));
        Assert.assertTrue(randomizedSet.remove(0));
        Assert.assertTrue(randomizedSet.insert(-1));
        Assert.assertFalse(randomizedSet.remove(0));
        Assert.assertEquals(-1, randomizedSet.getRandom());
        Assert.assertEquals(-1, randomizedSet.getRandom());

    }

    @Test
    public void test3() {
        Assert.assertTrue(randomizedSet.insert(1));
        Assert.assertTrue(randomizedSet.insert(2));
        Assert.assertTrue(randomizedSet.insert(3));
        Assert.assertFalse(randomizedSet.insert(4));
        Assert.assertEquals(-1, randomizedSet.getRandom());
        Assert.assertEquals(-1, randomizedSet.getRandom());

    }

    @Test
    public void test4() {
        Assert.assertTrue(randomizedSet.insert(1));
        Assert.assertFalse(randomizedSet.remove(2));
        Assert.assertTrue(randomizedSet.insert(2));
        Assert.assertEquals(2, randomizedSet.getRandom());
        Assert.assertTrue(randomizedSet.remove(1));
        Assert.assertFalse(randomizedSet.insert(2));
        Assert.assertEquals(2, randomizedSet.getRandom());

    }

}
