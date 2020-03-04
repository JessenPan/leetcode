package org.jessenpan.leetcode.bfs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S752OpenTheLockTest {

    private S752OpenTheLock openTheLock = new S752OpenTheLock();

    @Test
    public void test1() {
        int t = openTheLock.openLock(new String[] { "0201", "0101", "0102", "1212", "2002" }, "0202");
        Assert.assertEquals(6, t);
    }

}
