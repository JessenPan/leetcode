package org.jessenpan.leetcode;

import org.jessenpan.leetcode.S71SimplifyPath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 * @date 2019-03-06 14:49
 */
public class S71_SimplifyPathTest {

    private S71SimplifyPath simplifyPath = new S71SimplifyPath();

    @Test
    public void test1() {
        String str = "/a//b////c/d//././/..";
        String[] strArray = str.split("/");
    }

    @Test
    public void test2() {
        String simplifiedPath = simplifyPath.simplifyPath("/a//b////c/d//././/..");
        assertEquals("/a/b/c", simplifiedPath);
    }

    @Test
    public void test3() {
        String simplifiedPath = simplifyPath.simplifyPath("/home/");
        assertEquals("/home", simplifiedPath);
    }

    @Test
    public void test4() {
        String simplifiedPath = simplifyPath.simplifyPath("/a/./b/../../c/");
        assertEquals("/c", simplifiedPath);
    }

    @Test
    public void test5() {
        String simplifiedPath = simplifyPath.simplifyPath("/a/../../b/../c//.//");
        assertEquals("/c", simplifiedPath);
    }
}
