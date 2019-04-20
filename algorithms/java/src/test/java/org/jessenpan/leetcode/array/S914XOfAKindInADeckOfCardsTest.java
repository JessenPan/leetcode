package org.jessenpan.leetcode.array;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S914XOfAKindInADeckOfCardsTest {

    private S914XOfAKindInADeckOfCards xOfAKindInADeckOfCards = new S914XOfAKindInADeckOfCards();

    @Test
    public void test1() {
        boolean isGroup = xOfAKindInADeckOfCards.hasGroupsSizeX(new int[] { 1, 2, 3, 4, 4, 3, 2, 1 });
        assertTrue(isGroup);
    }

    @Test
    public void test2() {
        boolean isGroup = xOfAKindInADeckOfCards.hasGroupsSizeX(new int[] { 1, 1, 1, 2, 2, 2, 3, 3 });
        assertFalse(isGroup);
    }

    @Test
    public void test3() {
        boolean isGroup = xOfAKindInADeckOfCards.hasGroupsSizeX(new int[] { 1 });
        assertFalse(isGroup);
    }

    @Test
    public void test4() {
        boolean isGroup = xOfAKindInADeckOfCards.hasGroupsSizeX(new int[] { 1, 1 });
        assertTrue(isGroup);
    }

    @Test
    public void test5() {
        boolean isGroup = xOfAKindInADeckOfCards.hasGroupsSizeX(new int[] { 1, 1, 2, 2, 2, 2 });
        assertTrue(isGroup);
    }

    @Test
    public void test6() {
        boolean isGroup = xOfAKindInADeckOfCards.hasGroupsSizeX(new int[] { 1, 1, 1, 1, 2, 2, 2, 2, 2, 2 });
        assertTrue(isGroup);
    }

}
