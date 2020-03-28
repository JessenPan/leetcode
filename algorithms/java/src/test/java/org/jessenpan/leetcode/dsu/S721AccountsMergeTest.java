package org.jessenpan.leetcode.dsu;

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

    @Test
    public void test2() {
        List<List<String>> lists = accountsMerge.accountsMerge(asList(asList("David", "David0@m.co", "David1@m.co"), asList("David", "David3@m.co", "David4@m.co"), asList("David", "David4@m.co", "David5@m.co"), asList("David", "David2@m.co", "David3@m.co"), asList("David", "David1@m.co", "David2@m.co")));
        List<List<String>> experts = asList(asList("David", "David0@m.co", "David1@m.co", "David2@m.co", "David3@m.co", "David4@m.co", "David5@m.co"));
        Assert.assertEquals(experts, lists);
    }

    @Test
    public void test3() {
        List<List<String>> lists = accountsMerge.accountsMerge(asList(asList("Gabe", "Gabe3@m.co", "Gabe4@m.co", "Gabe2@m.co"), asList("Gabe", "Gabe0@m.co", "Gabe3@m.co", "Gabe2@m.co"), asList("Kevin", "Kevin4@m.co", "Kevin2@m.co", "Kevin2@m.co"), asList("Alex", "Alex5@m.co", "Alex4@m.co", "Alex0@m.co"), asList("Ethan", "Ethan3@m.co", "Ethan3@m.co", "Ethan0@m.co")));
        List<List<String>> experts = asList(asList("David", "David0@m.co", "David1@m.co", "David2@m.co", "David3@m.co", "David4@m.co", "David5@m.co"));
        Assert.assertEquals(experts, lists);
    }

}
