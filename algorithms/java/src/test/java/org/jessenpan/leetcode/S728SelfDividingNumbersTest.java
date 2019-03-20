package org.jessenpan.leetcode;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S728SelfDividingNumbersTest {

    private S728SelfDividingNumbers selfDividingNumbers = new S728SelfDividingNumbers();

    @Test
    public void test1() {
        List<Integer> numbers = selfDividingNumbers.selfDividingNumbers(1, 22);
        assertEquals(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22), numbers);
    }

}
