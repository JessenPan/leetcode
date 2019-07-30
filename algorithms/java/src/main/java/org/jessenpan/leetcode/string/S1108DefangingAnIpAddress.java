package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S1108DefangingAnIpAddress {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }

}
