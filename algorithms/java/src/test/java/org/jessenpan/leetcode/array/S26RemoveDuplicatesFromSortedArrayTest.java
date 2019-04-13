package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S26RemoveDuplicatesFromSortedArrayTest {

    private S26RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray = new S26RemoveDuplicatesFromSortedArray();
    
    @Test
    public void test1(){
        int length = removeDuplicatesFromSortedArray.removeDuplicates(new int[] { 1, 1, 2 });
        assertEquals(2,length);
    }
    
}
