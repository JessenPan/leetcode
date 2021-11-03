package org.jessenpan.leetcode.binarysearch;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S875KokoEatingBananasTest {

    private S875KokoEatingBananas kokoEatingBananas = new S875KokoEatingBananas();

    @Test
    public void test1() {
        int t = kokoEatingBananas.minEatingSpeed(new int[] { 3, 6, 7, 11 }, 8);
        Assert.assertEquals(4, t);
    }

    @Test
    public void test2() {
        int t = kokoEatingBananas.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 5);
        Assert.assertEquals(30, t);
    }

    @Test
    public void test3() {
        int t = kokoEatingBananas.minEatingSpeed(new int[] { 30, 11, 23, 4, 20 }, 6);
        Assert.assertEquals(23, t);
    }
    
    @Test
    public void test4() {
        int t = kokoEatingBananas.minEatingSpeed(new int[] { 332484035, 524908576, 855865114, 632922376, 222257295, 690155293, 112677673, 679580077, 337406589, 290818316, 877337160, 901728858, 679284947, 688210097, 692137887, 718203285, 629455728, 941802184 }, 823855818);
        Assert.assertEquals(14, t);
    }
}
