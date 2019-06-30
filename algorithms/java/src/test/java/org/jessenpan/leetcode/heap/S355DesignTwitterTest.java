package org.jessenpan.leetcode.heap;

import org.junit.Test;

import java.util.List;

import static org.jessenpan.leetcode.heap.S355DesignTwitter.Twitter;

/**
 * @author jessenpan
 */
public class S355DesignTwitterTest {

    private Twitter twitter = new Twitter();

    @Test
    public void test1() {
        twitter.postTweet(1, 5);
        List<Integer> tweets = twitter.getNewsFeed(1);
        System.out.println(tweets);
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        tweets = twitter.getNewsFeed(1);
        System.out.println(tweets);
        twitter.unfollow(1, 2);
        tweets = twitter.getNewsFeed(1);
        System.out.println(tweets);
    }

    @Test
    public void test2() {
        twitter.postTweet(1, 5);
        twitter.postTweet(1, 3);
        List<Integer> tweets = twitter.getNewsFeed(1);
        System.out.println(tweets);
    }

}
