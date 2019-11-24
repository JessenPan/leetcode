package org.jessenpan.leetcode.map;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S205IsomorphicStringsTest {

    private S205IsomorphicStrings isomorphicStrings = new S205IsomorphicStrings();
    
    @Test
    public void test1(){
        boolean isOmorphic = isomorphicStrings.isIsomorphic("egg", "add");
        assertTrue(isOmorphic);
    }

    @Test
    public void test2(){
        boolean isOmorphic = isomorphicStrings.isIsomorphic("foo", "bar");
        assertFalse(isOmorphic);
    }

    @Test
    public void test3(){
        boolean isOmorphic = isomorphicStrings.isIsomorphic("paper", "title");
        assertTrue(isOmorphic);
    }

    @Test
    public void test4(){
        boolean isOmorphic = isomorphicStrings.isIsomorphic("ab", "aa");
        assertFalse(isOmorphic);
    }
    
}
