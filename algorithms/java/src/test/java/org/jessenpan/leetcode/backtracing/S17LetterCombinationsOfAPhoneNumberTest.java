package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S17LetterCombinationsOfAPhoneNumber;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author jessenpan
 */
public class S17LetterCombinationsOfAPhoneNumberTest {

    private S17LetterCombinationsOfAPhoneNumber letterCombinationsOfAPhoneNumber = new S17LetterCombinationsOfAPhoneNumber();

    @Test
    public void test1() {
        List<String> letters = letterCombinationsOfAPhoneNumber.letterCombinations("23");
        Assert.assertEquals(9,letters.size());
    }

}
