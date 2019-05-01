package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S744FindSmallestLetterGreaterThanTargetTest {

    private S744FindSmallestLetterGreaterThanTarget findSmallestLetterGreaterThanTarget = new S744FindSmallestLetterGreaterThanTarget();

    @Test
    public void test1() {
        char letter = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'a');
        Assert.assertEquals('c',letter);
    }

    @Test
    public void test2() {
        char letter = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'c');
        Assert.assertEquals('f',letter);
    }

    @Test
    public void test3() {
        char letter = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'd');
        Assert.assertEquals('f',letter);
    }

    @Test
    public void test4() {
        char letter = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'g');
        Assert.assertEquals('j',letter);
    }

    @Test
    public void test5() {
        char letter = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'j');
        Assert.assertEquals('c',letter);
    }

    @Test
    public void test6() {
        char letter = findSmallestLetterGreaterThanTarget.nextGreatestLetter(new char[] { 'c', 'f', 'j' }, 'k');
        Assert.assertEquals('c',letter);
    }

}
