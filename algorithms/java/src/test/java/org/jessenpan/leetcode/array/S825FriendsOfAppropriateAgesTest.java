package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S825FriendsOfAppropriateAgesTest {

    private S825FriendsOfAppropriateAges friendsOfAppropriateAges = new S825FriendsOfAppropriateAges();

    @Test
    public void test1() {
        int num = friendsOfAppropriateAges.numFriendRequests(new int[] { 16, 16 });
        Assert.assertEquals(2, num);
    }

    @Test
    public void test2() {
        int num = friendsOfAppropriateAges.numFriendRequests(new int[] { 16, 17, 18 });
        Assert.assertEquals(2, num);
    }

    @Test
    public void test3() {
        int num = friendsOfAppropriateAges.numFriendRequests(new int[] { 20, 30, 100, 110, 120 });
        Assert.assertEquals(3, num);
    }

}
