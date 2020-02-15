package org.jessenpan.leetcode.map;

import org.jessenpan.leetcode.map.S981TimeBasedKeyValueStore.TimeMap;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S981TimeBasedKeyValueStoreTest {

    @Test
    public void test1() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);
        Assert.assertEquals("bar", timeMap.get("foo", 1));
        Assert.assertEquals("bar", timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4);
        Assert.assertEquals("bar2", timeMap.get("foo", 4));
        Assert.assertEquals("bar2", timeMap.get("foo", 5));
    }

    @Test
    public void test2() {
        TimeMap timeMap = new TimeMap();
        timeMap.set("love", "high", 10);
        timeMap.set("love", "low", 20);
        Assert.assertEquals("", timeMap.get("love", 5));
        Assert.assertEquals("high", timeMap.get("love", 10));
        Assert.assertEquals("high", timeMap.get("love", 15));
        Assert.assertEquals("low", timeMap.get("love", 20));
        Assert.assertEquals("low", timeMap.get("love", 25));
    }

}
