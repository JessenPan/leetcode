package org.jessenpan.leetcode.math;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S858MirrorReflectionTest {

    private S858MirrorReflection mirrorReflection = new S858MirrorReflection();

    @Test
    public void test1() {
        int t = mirrorReflection.mirrorReflection(2, 1);
        Assert.assertEquals(2, t);
    }

}
