package org.jessenpan.leetcode.hashmap;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S706DesignHashMapTest {

    private S706DesignHashMap.MyHashMap designHashMap = new S706DesignHashMap.MyHashMap();

    @Test
    public void test1() {
        designHashMap.put(1, 1);
        designHashMap.put(2, 2);
        assertEquals(1, designHashMap.get(1));
        assertEquals(-1, designHashMap.get(3));
        designHashMap.put(2, 1);
        assertEquals(1, designHashMap.get(2));
        designHashMap.remove(2);
        assertEquals(-1, designHashMap.get(2));
    }

}
