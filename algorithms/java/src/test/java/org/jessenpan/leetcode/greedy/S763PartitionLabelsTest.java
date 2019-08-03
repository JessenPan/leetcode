package org.jessenpan.leetcode.greedy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S763PartitionLabelsTest {

    private S763PartitionLabels partitionLabels = new S763PartitionLabels();

    @Test
    public void test1() {
        List<Integer> labels = partitionLabels.partitionLabels("ababcbacadefegdehijhklij");
        Assert.assertEquals(Arrays.asList(9, 7, 8), labels);
    }

}
