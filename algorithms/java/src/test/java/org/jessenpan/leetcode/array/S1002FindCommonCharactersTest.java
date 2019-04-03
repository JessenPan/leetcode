package org.jessenpan.leetcode.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S1002FindCommonCharactersTest {

    private S1002FindCommonCharacters findCommonCharacters = new S1002FindCommonCharacters();

    @Test
    public void test() {
        List<String> list = findCommonCharacters.commonChars(new String[] { "bella", "label", "roller" });
        assertEquals(Arrays.asList("e", "l", "l"), list);
    }

    @Test
    public void test1() {
        List<String> list = findCommonCharacters.commonChars(new String[] { "cool", "lock", "cook" });
        assertEquals(Arrays.asList("c", "o"), list);
    }

}
