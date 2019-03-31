package org.jessenpan.leetcode.math;

import org.jessenpan.leetcode.math.S171ExcelSheetColumnNumber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S171ExcelSheetColumnNumberTest {

    private S171ExcelSheetColumnNumber excelSheetColumnNumber = new S171ExcelSheetColumnNumber();

    @Test
    public void test1() {
        int number = excelSheetColumnNumber.titleToNumber("A");
        assertEquals(1, number);
    }

    @Test
    public void test2() {
        int number = excelSheetColumnNumber.titleToNumber("AB");
        assertEquals(28, number);
    }

    @Test
    public void test3() {
        int number = excelSheetColumnNumber.titleToNumber("ZY");
        assertEquals(701, number);
    }
}
