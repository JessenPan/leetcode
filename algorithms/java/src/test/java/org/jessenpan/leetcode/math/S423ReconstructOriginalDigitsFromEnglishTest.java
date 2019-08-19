package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S423ReconstructOriginalDigitsFromEnglishTest {

    private S423ReconstructOriginalDigitsFromEnglish reconstructOriginalDigitsFromEnglish = new S423ReconstructOriginalDigitsFromEnglish();

    @Test
    public void test1() {
        String s = reconstructOriginalDigitsFromEnglish.originalDigits("owoztneoer");
        Assert.assertEquals("012", s);
    }

    @Test
    public void test2() {
        String s = reconstructOriginalDigitsFromEnglish.originalDigits("fviefuro");
        Assert.assertEquals("45", s);
    }

}
