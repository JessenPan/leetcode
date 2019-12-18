package org.jessenpan.leetcode.map;

import org.jessenpan.leetcode.map.S146LruCache.LRUCache;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S146LruCacheTest {

    @Test
    public void test1() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        Assert.assertEquals(1, cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        Assert.assertEquals(-1, cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        Assert.assertEquals(-1, cache.get(1));       // 返回 -1 (未找到)
        Assert.assertEquals(3, cache.get(3));
        Assert.assertEquals(4, cache.get(4));
    }

}
