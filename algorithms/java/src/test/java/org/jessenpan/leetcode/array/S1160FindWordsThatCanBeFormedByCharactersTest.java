package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S1160FindWordsThatCanBeFormedByCharactersTest {

    private S1160FindWordsThatCanBeFormedByCharacters findWordsThatCanBeFormedByCharacters = new S1160FindWordsThatCanBeFormedByCharacters();

    @Test
    public void test1() {
        int c = findWordsThatCanBeFormedByCharacters.countCharacters(new String[] { "cat", "bt", "hat", "tree" }, "atach");
        Assert.assertEquals(6, c);
    }

    @Test
    public void test2() {
        int c = findWordsThatCanBeFormedByCharacters.countCharacters(new String[] { "hello", "world", "leetcode" }, "welldonehoneyr");
        Assert.assertEquals(10, c);
    }

}
