package org.jessenpan.leetcode.array;

import org.jessenpan.leetcode.array.S381InsertDeleteGetrandomO1DuplicatesAllowed.RandomizedCollection;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S381InsertDeleteGetrandomO1DuplicatesAllowedTest {

    private RandomizedCollection randomizedCollection = new RandomizedCollection();

    @Test
    public void test1() {
        randomizedCollection.insert(1);
        randomizedCollection.insert(1);
        randomizedCollection.insert(2);
        System.out.println(randomizedCollection.getRandom());
        randomizedCollection.remove(1);
        System.out.println(randomizedCollection.getRandom());
    }

    @Test
    public void test2() {
        randomizedCollection.insert(1);
        randomizedCollection.insert(1);
        randomizedCollection.insert(2);
        randomizedCollection.insert(1);
        randomizedCollection.insert(2);
        randomizedCollection.insert(2);
        randomizedCollection.remove(1);
        randomizedCollection.remove(2);
        randomizedCollection.remove(2);
        randomizedCollection.remove(2);
        System.out.println(randomizedCollection.getRandom());
    }

}
