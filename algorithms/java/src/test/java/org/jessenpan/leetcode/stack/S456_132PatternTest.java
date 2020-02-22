package org.jessenpan.leetcode.stack;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S456_132PatternTest {

    private S456_132Pattern patternOf132 = new S456_132Pattern();

    @Test
    public void test1() {
        boolean valid = patternOf132.find132pattern(new int[] { 1, 2, 3, 4 });
        Assert.assertFalse(valid);
    }
    
    @Test
    public void test2(){
        boolean valid = patternOf132.find132pattern(new int[] { 3, 1, 4, 2 });
        Assert.assertTrue(valid);
    }


    @Test
    public void test3(){
        boolean valid = patternOf132.find132pattern(new int[] { -1, 3, 2, 0 });
        Assert.assertTrue(valid);
    }

}
