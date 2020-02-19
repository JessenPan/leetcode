package org.jessenpan.leetcode.map;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author jessenpan
 */
public class S721AccountsMergeTest {

    private S721AccountsMerge accountsMerge = new S721AccountsMerge();

    @Test
    public void test1() {
        List<List<String>> lists = accountsMerge.accountsMerge(asList(asList("John", "johnsmith@mail.com", "john00@mail.com"), asList("John", "johnnybravo@mail.com"), asList("John", "johnsmith@mail.com", "john_newyork@mail.com"), asList("Mary", "mary@mail.com")));
        List<List<String>> experts = asList(asList("John", "john00@mail.com", "john_newyork@mail.com", "johnsmith@mail.com"), asList("John", "johnnybravo@mail.com"), asList("Mary", "mary@mail.com"));
        Assert.assertEquals(experts, lists);
    }

}
