package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;

/**
 * @author jessenpan
 */
public class S841KeysAndRoomsTest {

    private S841KeysAndRooms keysAndRooms = new S841KeysAndRooms();

    @Test
    public void test1() {
        boolean b = keysAndRooms.canVisitAllRooms(Arrays.asList(singletonList(1), singletonList(2), singletonList(3), emptyList()));
        Assert.assertTrue(b);
    }

    @Test
    public void test2() {
        boolean b = keysAndRooms.canVisitAllRooms(Arrays.asList(Arrays.asList(1, 3), Arrays.asList(3, 0, 1), Arrays.asList(2), Arrays.asList(0)));
        Assert.assertFalse(b);
    }

    @Test
    public void test3() {
        boolean b = keysAndRooms.canVisitAllRooms(Arrays.asList(Arrays.asList(1, 1), Collections.emptyList()));
        Assert.assertTrue(b);
    }

}
