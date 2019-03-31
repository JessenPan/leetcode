package org.jessenpan.leetcode.stack;

import org.jessenpan.leetcode.stack.S71SimplifyPath;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S71SimplifyPathTest {

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
