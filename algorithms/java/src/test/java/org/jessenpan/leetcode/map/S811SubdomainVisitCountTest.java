package org.jessenpan.leetcode.map;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S811SubdomainVisitCountTest {

    private S811SubdomainVisitCount subdomainVisitCount = new S811SubdomainVisitCount();
    
    @Test
    public void test1() {
        List<String> subDomains = subdomainVisitCount.subdomainVisits(new String[] {"9001 discuss.leetcode.com"});
        assertEquals(Arrays.asList("9001 discuss.leetcode.com", "9001 leetcode.com", "9001 com"),subDomains);
    }

    @Test
    public void test2() {
        List<String> subDomains = subdomainVisitCount.subdomainVisits(new String[] {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
        assertEquals(Arrays.asList("901 mail.com","50 yahoo.com","900 google.mail.com","5 wiki.org","5 org","1 intel.mail.com","951 com"),subDomains);
    }
    
}
