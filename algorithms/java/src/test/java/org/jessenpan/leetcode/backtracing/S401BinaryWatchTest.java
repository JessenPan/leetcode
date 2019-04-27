package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S401BinaryWatch;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S401BinaryWatchTest {

    private S401BinaryWatch binaryWatch = new S401BinaryWatch();

    @Test
    public void test1() {
        List<String> times = binaryWatch.readBinaryWatch(1);
        List<String> experts = asList("1:00", "2:00", "4:00", "8:00", "0:01", "0:02", "0:04", "0:08", "0:16", "0:32");
        Collections.sort(experts);
        Collections.sort(times);
        assertEquals(experts, times);
    }

    @Test
    public void test2() {
        List<String> times = binaryWatch.readBinaryWatch(2);
        List<String> experts = asList("0:03", "0:05", "0:06", "0:09", "0:10", "0:12", "0:17", "0:18", "0:20", "0:24", "0:33", "0:34", "0:36", "0:40", "0:48", "1:01", "1:02", "1:04", "1:08", "1:16", "1:32", "2:01", "2:02", "2:04", "2:08", "2:16", "2:32", "3:00", "4:01", "4:02", "4:04", "4:08", "4:16", "4:32", "5:00", "6:00", "8:01", "8:02", "8:04", "8:08", "8:16", "8:32", "9:00", "10:00");
        Collections.sort(experts);
        Collections.sort(times);
        assertEquals(experts, times);
    }
}
