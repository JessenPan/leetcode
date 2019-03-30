package org.jessenpan.leetcode.queue;

import org.jessenpan.leetcode.queue.S933NumberOfRecentCalls.RecentCounter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S933NumberOfRecentCallsTest {

    private RecentCounter recentCounter = new RecentCounter();
    
    @Test
    public void test(){
        assertEquals(1,recentCounter.ping(1));
        assertEquals(2, recentCounter.ping(100));
        assertEquals(3, recentCounter.ping(3001));
        assertEquals(3, recentCounter.ping(3002));
    }

}
