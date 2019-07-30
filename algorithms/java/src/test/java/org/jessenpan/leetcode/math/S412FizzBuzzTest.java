package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S412FizzBuzzTest {

    private S412FizzBuzz fizzBuzz = new S412FizzBuzz();

    @Test
    public void test1() {
        List<String> list = fizzBuzz.fizzBuzz(15);
        Assert.assertEquals(Arrays.asList("1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"), list);
    }

}
