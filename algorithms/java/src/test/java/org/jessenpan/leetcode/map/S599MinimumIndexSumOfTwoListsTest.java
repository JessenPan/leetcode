package org.jessenpan.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S599MinimumIndexSumOfTwoListsTest {

    private S599MinimumIndexSumOfTwoLists s599MinimumIndexSumOfTwoLists = new S599MinimumIndexSumOfTwoLists();

    @Test
    public void test1() {
        String[] res = s599MinimumIndexSumOfTwoLists.findRestaurant(new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" }, new String[] { "Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun" });
        Assert.assertArrayEquals(new String[] { "Shogun" }, res);
    }

    @Test
    public void test2() {
        String[] res = s599MinimumIndexSumOfTwoLists.findRestaurant(new String[] { "Shogun", "Tapioca Express", "Burger King", "KFC" }, new String[] { "KFC", "Shogun", "Burger King" });
        Assert.assertArrayEquals(new String[] { "Shogun" }, res);
    }

}
