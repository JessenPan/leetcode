package org.jessenpan.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S824GoatLatinTest {

    private S824GoatLatin goatLatin = new S824GoatLatin();

    @Test
    public void test1() {
        String goatStr = goatLatin.toGoatLatin("I speak Goat Latin");
        assertEquals("Imaa peaksmaaa oatGmaaaa atinLmaaaaa", goatStr);
    }

    @Test
    public void test2() {
        String goatStr = goatLatin.toGoatLatin("The quick brown fox jumped over the lazy dog");
        assertEquals("heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa", goatStr);
    }

}
