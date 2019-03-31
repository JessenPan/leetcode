package org.jessenpan.leetcode.string;

import org.jessenpan.leetcode.S929UniqueEmailAddresses;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S929UniqueEmailAddressesTest {

    private S929UniqueEmailAddresses uniqueEmailAddresses = new S929UniqueEmailAddresses();
    
    @Test
    public void test(){
       int theUniqueEmailNum= uniqueEmailAddresses.numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"});
        assertEquals(2,theUniqueEmailNum);
    }

}
