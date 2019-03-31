package org.jessenpan.leetcode;

import org.jessenpan.leetcode.math.S168ExcelSheetColumnTitle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S168ExcelSheetColumnTitleTest {

    private S168ExcelSheetColumnTitle excelSheetColumnTitle = new S168ExcelSheetColumnTitle();

    @Test
    public void test1() {
        String result = excelSheetColumnTitle.convertToTitle(52);
        assertEquals("AZ", result);
    }

    @Test
    public void test2() {
        String result = excelSheetColumnTitle.convertToTitle(701);
        assertEquals("ZY", result);
    }
}
