package org.jessenpan.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1189MaximumNumberOfBalloonsTest {

    private S1189MaximumNumberOfBalloons maximumNumberOfBalloons = new S1189MaximumNumberOfBalloons();

    @Test
    public void test1() {
        int t = maximumNumberOfBalloons.maxNumberOfBalloons("nlaebolko");
        Assert.assertEquals(1, t);
    }

    @Test
    public void test2() {
        int t = maximumNumberOfBalloons.maxNumberOfBalloons("loonbalxballpoon");
        Assert.assertEquals(2, t);
    }

    @Test
    public void test3() {
        int t = maximumNumberOfBalloons.maxNumberOfBalloons("leetcode");
        Assert.assertEquals(0, t);
    }

}
