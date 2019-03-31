package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.S520DetectCapital;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S520DetectCapitalTest {

    private S520DetectCapital detectCapital = new S520DetectCapital();

    @Test
    public void test1() {
        boolean isLegal = detectCapital.detectCapitalUse("USA");
        assertTrue(isLegal);
    }

    @Test
    public void test2() {
        boolean isLegal = detectCapital.detectCapitalUse("FlaG");
        assertFalse(isLegal);
    }

    @Test
    public void test3() {
        boolean isLegal = detectCapital.detectCapitalUse("leetcode");
        assertTrue(isLegal);
    }

    @Test
    public void test4() {
        boolean isLegal = detectCapital.detectCapitalUse("Google");
        assertTrue(isLegal);
    }

    @Test
    public void test5() {
        boolean isLegal = detectCapital.detectCapitalUse("gOogle");
        assertFalse(isLegal);
    }

}
