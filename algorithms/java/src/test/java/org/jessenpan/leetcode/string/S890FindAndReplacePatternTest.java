package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S890FindAndReplacePatternTest {

    private S890FindAndReplacePattern findAndReplacePattern = new S890FindAndReplacePattern();

    @Test
    public void test1() {
        List<String> ans = findAndReplacePattern.findAndReplacePattern(new String[] { "abc", "deq", "mee", "aqq", "dkd", "ccc" }, "abb");
        Assert.assertEquals(Arrays.asList("mee", "aqq"), ans);
    }

}
