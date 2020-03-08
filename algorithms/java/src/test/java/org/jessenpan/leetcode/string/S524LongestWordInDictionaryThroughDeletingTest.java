package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author jessenpan
 */
public class S524LongestWordInDictionaryThroughDeletingTest {

    private S524LongestWordInDictionaryThroughDeleting longestWordInDictionaryThroughDeleting = new S524LongestWordInDictionaryThroughDeleting();

    @Test
    public void test1() {
        String word = longestWordInDictionaryThroughDeleting.findLongestWord("abpcplea", Arrays.asList("ale", "apple", "monkey", "plea"));
        Assert.assertEquals("apple", word);
    }

    @Test
    public void test2() {
        String word = longestWordInDictionaryThroughDeleting.findLongestWord("abpcplea", Arrays.asList("a", "b", "c"));
        Assert.assertEquals("a", word);
    }

}
