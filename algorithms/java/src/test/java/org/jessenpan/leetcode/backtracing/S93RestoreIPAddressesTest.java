package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S93RestoreIPAddresses;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author jessenpan
 */
public class S93RestoreIPAddressesTest {

    private S93RestoreIPAddresses restoreIPAddresses = new S93RestoreIPAddresses();

    @Test
    public void test1() {
        List<String> ips = restoreIPAddresses.restoreIpAddresses("25525511135");
        Assert.assertEquals(Arrays.asList("255.255.11.135", "255.255.111.35"), ips);
    }

    @Test
    public void test2() {
        List<String> ips = restoreIPAddresses.restoreIpAddresses("0000");
        Assert.assertEquals(Arrays.asList("0.0.0.0"), ips);
    }

    @Test
    public void test3() {
        List<String> ips = restoreIPAddresses.restoreIpAddresses("010010");
        Assert.assertEquals(Arrays.asList("0.10.0.10", "0.100.1.0"), ips);
    }

}
