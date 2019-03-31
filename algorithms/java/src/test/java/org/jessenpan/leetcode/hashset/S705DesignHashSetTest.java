package org.jessenpan.leetcode.hashset;

import org.jessenpan.leetcode.S705DesignHashSet;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S705DesignHashSetTest {

    private S705DesignHashSet.MyHashSet designHashSet = new S705DesignHashSet.MyHashSet();

    @Test
    public void test() {
        designHashSet.add(1);
        designHashSet.add(2);
        assertTrue(designHashSet.contains(1));
        assertFalse(designHashSet.contains(3));
        designHashSet.add(2);
        assertTrue(designHashSet.contains(2));
        designHashSet.remove(2);
        assertTrue(designHashSet.contains(2));
    }

}
