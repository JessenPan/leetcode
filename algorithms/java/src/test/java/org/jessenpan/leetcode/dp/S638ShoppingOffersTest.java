package org.jessenpan.leetcode.dp;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S638ShoppingOffersTest {

    private S638ShoppingOffers shoppingOffers = new S638ShoppingOffers();

    @Test
    public void test1() {
        int v = shoppingOffers.shoppingOffers(Arrays.asList(2, 5), Arrays.asList(Arrays.asList(3, 0, 5), Arrays.asList(1, 2, 10)), Arrays.asList(3, 2));
        Assert.assertEquals(14, v);
    }

    @Test
    public void test2() {
        int v = shoppingOffers.shoppingOffers(Arrays.asList(2, 3, 4), Arrays.asList(Arrays.asList(1, 1, 0, 4), Arrays.asList(2, 2, 1, 9)), Arrays.asList(1, 2, 1));
        Assert.assertEquals(11, v);
    }

}
