package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S482LicenseKeyFormattingTest {

    private S482LicenseKeyFormatting licenseKeyFormatting = new S482LicenseKeyFormatting();

    @Test
    public void test1() {
        String str = licenseKeyFormatting.licenseKeyFormatting("5F3Z-2e-9-w", 4);
        Assert.assertEquals("5F3Z-2E9W", str);
    }

    @Test
    public void test2() {
        String str = licenseKeyFormatting.licenseKeyFormatting("2-5g-3-J", 2);
        Assert.assertEquals("2-5G-3J", str);
    }

}
