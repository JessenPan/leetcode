package org.jessenpan.leetcode.bit;

import org.jessenpan.leetcode.S461HammingDistance;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S461HammingDistanceTest {

    private S461HammingDistance hammingDistance = new S461HammingDistance();

    @Test
    public void test() {
        int distance = hammingDistance.hammingDistance(1, 4);
        assertEquals(2, distance);
    }

}
