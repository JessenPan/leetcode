package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S971ReverseOnlyLettersTest {

    private S971ReverseOnlyLetters reverseOnlyLetters = new S971ReverseOnlyLetters();

    @Test
    public void test1() {
        String reversed = reverseOnlyLetters.reverseOnlyLetters("ab-cd");
        assertEquals("dc-ba", reversed);
    }

    @Test
    public void test2() {
        String reversed = reverseOnlyLetters.reverseOnlyLetters("a-bC-dEf-ghIj");
        assertEquals("j-Ih-gfE-dCba", reversed);
    }

    @Test
    public void test3() {
        String reversed = reverseOnlyLetters.reverseOnlyLetters("Test1ng-Leet=code-Q!");
        assertEquals("Qedo1ct-eeLg=ntse-T!", reversed);
    }

}
