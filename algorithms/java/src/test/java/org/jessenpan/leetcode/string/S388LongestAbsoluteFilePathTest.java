package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S388LongestAbsoluteFilePathTest {

    private S388LongestAbsoluteFilePath longestAbsoluteFilePath = new S388LongestAbsoluteFilePath();

    @Test
    public void test1() {
        int len = longestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t\tfile2.ext");
        Assert.assertEquals(32, len);
    }

    @Test
    public void test2() {
        int len = longestAbsoluteFilePath.lengthLongestPath("dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext");
        Assert.assertEquals(20, len);
    }

    @Test
    public void test3() {
        int len = longestAbsoluteFilePath.lengthLongestPath("dir\n    file.txt");
        Assert.assertEquals(12, len);
    }

    @Test
    public void test4() {
        int len = longestAbsoluteFilePath.lengthLongestPath("dir\n        file.txt");
        Assert.assertEquals(16, len);
    }

}
