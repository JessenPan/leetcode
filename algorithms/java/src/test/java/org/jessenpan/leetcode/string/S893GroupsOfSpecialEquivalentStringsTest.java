package org.jessenpan.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S893GroupsOfSpecialEquivalentStringsTest {

    private S893GroupsOfSpecialEquivalentStrings groupsOfSpecialEquivalentStrings = new S893GroupsOfSpecialEquivalentStrings();

    @Test
    public void test1() {
        int groupSize = groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(new String[] { "a", "b", "c", "a", "c", "c" });
        assertEquals(3, groupSize);
    }

    @Test
    public void test2() {
        int groupSize = groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(new String[] { "aa", "bb", "ab", "ba" });
        assertEquals(4, groupSize);
    }

    @Test
    public void test3() {
        int groupSize = groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(new String[] { "abc", "acb", "bac", "bca", "cab", "cba" });
        assertEquals(3, groupSize);
    }

    @Test
    public void test4() {
        int groupSize = groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(new String[] { "abcd", "cdab", "adcb", "cbad" });
        assertEquals(1, groupSize);
    }

    @Test
    public void test5() {
        int groupSize = groupsOfSpecialEquivalentStrings.numSpecialEquivGroups(
                new String[] { "demp", "cfhp", "dzvf", "ggxe", "hkte", "clug", "nhgk", "hvwj", "zozr", "datm", "hisr", "gfry", "jknr", "laju", "emsf", "duwe", "ilta", "gjrd", "woaq", "zhdm", "ujmz", "jalu", "tkhe", "gexg", "hrsi", "tail", "ilta", "xegg", "srhi", "clug", "cgul", "gexg", "tehk", "ulcg", "xgge", "cgul", "hrsi", "aowq", "jalu", "laju", "vzdf", "gexg", "hpcf", "zhdm", "hfcp", "zhdm", "ulcg", "jalu", "ggxe", "gexg", "nkgh", "hrsi", "vfdz", "nkgh", "cgul", "hpcf", "hetk", "zrzo", "xegg", "nkgh", "srhi", "smef", "ulcg", "hrsi", "ggxe", "ggxe", "efsm", "ggxe", "jalu", "srhi", "dmzh", "laju", "zmdh", "sfem", "tehk", "srhi", "wqao", "gknh", "jalu", "iatl", "gexg", "ugcl", "nkgh", "hrsi", "srhi", "hkte", "gdrj", "zozr", "hisr", "sihr", "smef", "zmdh", "clug", "iatl", "cgul", "woaq",
                        "jrnk", "sihr", "xegg", "luja" });
        assertEquals(21, groupSize);
    }

}
