package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S395LongestSubstringWithAtLeastKRepeatingCharactersTest {

    private S395LongestSubstringWithAtLeastKRepeatingCharacters longestSubstringWithAtLeastKRepeatingCharacters = new S395LongestSubstringWithAtLeastKRepeatingCharacters();

    @Test
    public void test1() {
        int longest = longestSubstringWithAtLeastKRepeatingCharacters.longestSubstring("aaabb", 3);
        Assert.assertEquals(3, longest);
    }

    @Test
    public void test2() {
        int longest = longestSubstringWithAtLeastKRepeatingCharacters.longestSubstring("ababbc", 2);
        Assert.assertEquals(5, longest);
    }

    @Test
    public void test3() {
        int longest = longestSubstringWithAtLeastKRepeatingCharacters.longestSubstring("ababacb", 3);
        Assert.assertEquals(0, longest);
    }

    @Test
    public void test4() {
        int longest = longestSubstringWithAtLeastKRepeatingCharacters.longestSubstring("aaabbb", 3);
        Assert.assertEquals(6, longest);
    }

    @Test
    public void test5() {
        int longest = longestSubstringWithAtLeastKRepeatingCharacters.longestSubstring("bbaaacbd", 3);
        Assert.assertEquals(3, longest);
    }

    @Test
    public void test6() {
        int longest = longestSubstringWithAtLeastKRepeatingCharacters.longestSubstring("bbaaacbd", 3);
        Assert.assertEquals(3, longest);
    }

}
