package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S406QueueReconstructionByHeightTest {

    private S406QueueReconstructionByHeight queueReconstructionByHeight = new S406QueueReconstructionByHeight();

    @Test
    public void test1() {
        int[][] queues = queueReconstructionByHeight.reconstructQueue(new int[][] { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } });
        Assert.assertArrayEquals(new int[][] { { 5, 0 }, { 7, 0 }, { 5, 2 }, { 6, 1 }, { 4, 4 }, { 7, 1 } }, queues);
    }

}
