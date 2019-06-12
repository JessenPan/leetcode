package org.jessenpan.leetcode.string;

import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S816AmbiguousCoordinatesTest {

    private S816AmbiguousCoordinates ambiguousCoordinates = new S816AmbiguousCoordinates();
    
    @Test
    public void test1(){
        List<String> nums = ambiguousCoordinates.ambiguousCoordinates("(123)");
        System.out.println(nums);
    }

    @Test
    public void test2(){
        List<String> nums = ambiguousCoordinates.ambiguousCoordinates("(00011)");
        System.out.println(nums);
    }

    @Test
    public void test3(){
        List<String> nums = ambiguousCoordinates.ambiguousCoordinates("(0123)");
        System.out.println(nums);
    }

    @Test
    public void test4(){
        List<String> nums = ambiguousCoordinates.ambiguousCoordinates("(100)");
        System.out.println(nums);
    }
    
}
