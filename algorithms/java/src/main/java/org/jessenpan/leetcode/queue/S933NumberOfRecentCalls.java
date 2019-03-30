package org.jessenpan.leetcode.queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:queue
 */
public class S933NumberOfRecentCalls {

    public static class RecentCounter {

        private final Integer THRESHOLD = 3000;

        private Queue<Integer> pingTimes = new LinkedList<>();

        public RecentCounter() {
        }

        public int ping(int t) {
            if (pingTimes.isEmpty()) {
                pingTimes.offer(t);
                return pingTimes.size();
            }
            pingTimes.offer(t);
            while (!pingTimes.isEmpty() && t - pingTimes.peek() > THRESHOLD) {
                pingTimes.poll();
            }
            return pingTimes.size();
        }
    }

}
