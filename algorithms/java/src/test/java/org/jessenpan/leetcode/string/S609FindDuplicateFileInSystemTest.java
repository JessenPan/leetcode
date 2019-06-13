package org.jessenpan.leetcode.string;

import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S609FindDuplicateFileInSystemTest {

    private S609FindDuplicateFileInSystem findDuplicateFileInSystem = new S609FindDuplicateFileInSystem();

    @Test
    public void test1() {
        List<List<String>> list = findDuplicateFileInSystem.findDuplicate(new String[] { "root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)" });
        System.out.println(list);
    }

}
