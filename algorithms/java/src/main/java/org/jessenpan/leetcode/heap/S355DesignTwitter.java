package org.jessenpan.leetcode.heap;

import java.util.*;

/**
 * @author jessenpan
 * tag:heap
 */
public class S355DesignTwitter {

    public static class Twitter {

        static class Tweet {

            int id;
            int seqId;

            Tweet(int id, int seqId) {
                this.id = id;
                this.seqId = seqId;
            }
        }

        private int tweetSeqId = 0;

        private Map<Integer, Set<Integer>> follows = new HashMap<>();

        private Map<Integer, List<Tweet>> tweets = new HashMap<>();

        public Twitter() {
        }

        public void postTweet(int userId, int tweetId) {
            List<Tweet> tweetList = tweets.computeIfAbsent(userId, id -> new ArrayList<>());
            tweetList.add(new Tweet(tweetId, tweetSeqId++));
        }

        public List<Integer> getNewsFeed(int userId) {
            Set<Integer> followIds = follows.computeIfAbsent(userId, id -> new HashSet<>());
            followIds.add(userId);
            PriorityQueue<Tweet> pQueue = new PriorityQueue<>((o1, o2) -> Integer.compare(o2.seqId, o1.seqId));

            for (Integer followId : followIds) {
                List<Tweet> theTweetsOfUser = tweets.get(followId);
                if (theTweetsOfUser != null && !theTweetsOfUser.isEmpty()) {

                    pQueue.addAll(theTweetsOfUser);
                }
            }
            int i = 0;

            List<Integer> tweets = new ArrayList<>();
            while (i < 10) {
                if (pQueue.isEmpty()) {
                    break;
                }
                tweets.add(pQueue.poll().id);
                i++;
            }

            return tweets;
        }

        public void follow(int followerId, int followeeId) {
            Set<Integer> followerIds = follows.computeIfAbsent(followerId, id -> new HashSet<>());
            followerIds.add(followeeId);
        }

        public void unfollow(int followerId, int followeeId) {
            Set<Integer> followerIds = follows.computeIfAbsent(followerId, id -> new HashSet<>());
            followerIds.remove(followeeId);
        }
    }

}
