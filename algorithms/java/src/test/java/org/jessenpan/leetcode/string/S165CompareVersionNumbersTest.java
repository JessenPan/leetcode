package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S165CompareVersionNumbersTest {

    private S165CompareVersionNumbers compareVersionNumbers = new S165CompareVersionNumbers();
    
    @Test
    public void test1(){
       int compared= compareVersionNumbers.compareVersion("0.1", "1.1");
        Assert.assertEquals(-1, compared);
    }

    @Test
    public void test2(){
        int compared= compareVersionNumbers.compareVersion("1.0.1", "1");
        Assert.assertEquals(1, compared);
    }

    @Test
    public void test3(){
        int compared= compareVersionNumbers.compareVersion("7.5.2.4", "7.5.3");
        Assert.assertEquals(-1, compared);
    }

    @Test
    public void test4(){
        int compared= compareVersionNumbers.compareVersion("1.01", "1.001");
        Assert.assertEquals(0, compared);
    }

    @Test
    public void test5(){
        int compared= compareVersionNumbers.compareVersion("1.0", "1.0.0");
        Assert.assertEquals(0, compared);
    }
    
}
