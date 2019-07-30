package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1108DefangingAnIpAddressTest {

    private S1108DefangingAnIpAddress defangingAnIpAddress = new S1108DefangingAnIpAddress();

    @Test
    public void test1() {
        String addr = defangingAnIpAddress.defangIPaddr("1.1.1.1");
        Assert.assertEquals("1[.]1[.]1[.]1", addr);
    }

    @Test
    public void test2() {
        String addr = defangingAnIpAddress.defangIPaddr("255.100.50.0");
        Assert.assertEquals("255[.]100[.]50[.]0", addr);
    }

}
