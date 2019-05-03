package org.jessenpan.leetcode.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S278FirstBadVersionTest {

    private S278FirstBadVersion firstBadVersion = new S278FirstBadVersion();
    
    @Test
    public void test1(){
       int theFirstBadVersion= firstBadVersion.firstBadVersion(5);
        Assert.assertEquals(4,theFirstBadVersion);
    }

    @Test
    public void test2(){
        int theFirstBadVersion= firstBadVersion.firstBadVersion(3);
        Assert.assertEquals(2,theFirstBadVersion);
    }
    
}
