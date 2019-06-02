package org.jessenpan.leetcode.trie;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S1023CamelcaseMatchingTest {

    private S1023CamelcaseMatching camelcaseMatching = new S1023CamelcaseMatching();

    @Test
    public void test1() {
        List<Boolean> booleans = camelcaseMatching.camelMatch(new String[] { "FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack" }, "FoBaT");
        Assert.assertEquals(Arrays.asList(false, true, false, false, false), booleans);
    }

    @Test
    public void test2() {
        List<Boolean> booleans = camelcaseMatching.camelMatch(new String[] { "FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack" }, "FoBa");
        Assert.assertEquals(Arrays.asList(true,false,true,false,false), booleans);
    }

    @Test
    public void test3() {
        List<Boolean> booleans = camelcaseMatching.camelMatch(new String[] { "FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack" }, "FB");
        Assert.assertEquals(Arrays.asList(true,false,true,true,false), booleans);
    }

}
