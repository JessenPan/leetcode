package org.jessenpan.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * @author jessenpan
 */
public class S937ReorderLogFilesTest {

    private S937ReorderLogFiles reorderLogFiles = new S937ReorderLogFiles();

    @Test
    public void test1() {
        String[] logFiles = reorderLogFiles.reorderLogFiles(new String[] { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo" });
        assertArrayEquals(new String[] { "g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7" }, logFiles);
    }

    @Test
    public void test2() {
        String[] logFiles = reorderLogFiles.reorderLogFiles(new String[] { "a1 9 2 3 1", "g1 act car", "zo4 4 7", "ab1 off key dog", "a8 act zoo", "a2 act car" });
        assertArrayEquals(new String[] { "a2 act car", "g1 act car", "a8 act zoo", "ab1 off key dog", "a1 9 2 3 1", "zo4 4 7" }, logFiles);
    }

}
