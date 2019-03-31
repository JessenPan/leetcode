package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.S434NumberOfSegmentsInAString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S434NumberOfSegmentsInAStringTest {

    private S434NumberOfSegmentsInAString numberOfSegmentsInAString = new S434NumberOfSegmentsInAString();

    @Test
    public void test1() {
        int number = numberOfSegmentsInAString.countSegments("Hello, my name is John");
        assertEquals(5, number);
    }

    @Test
    public void test2() {
        int number = numberOfSegmentsInAString.countSegments("  ");
        assertEquals(0, number);
    }

    @Test
    public void test3() {
        int number = numberOfSegmentsInAString.countSegments(", , , ,        a, eaefa");
        assertEquals(6, number);
    }

    @Test
    public void test4() {
        int number = numberOfSegmentsInAString.countSegments("Of all the gin joints in all the towns in all the world,   ");
        assertEquals(13, number);
    }
}
