package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S691StickersToSpellWord;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S691StickersToSpellWordTest {

    private S691StickersToSpellWord stickersToSpellWord = new S691StickersToSpellWord();

    @Test
    public void test1() {
        int stickerNum = stickersToSpellWord.minStickers(new String[] { "with", "example", "science" }, "thehat");
        Assert.assertEquals(3, stickerNum);
    }

    @Test
    public void test2() {
        int stickerNum = stickersToSpellWord.minStickers(new String[] {"notice", "possible" }, "basicbasic");
        Assert.assertEquals(-1, stickerNum);
    }

    @Test
    public void test3() {
        
        int stickerNum = stickersToSpellWord.minStickers(new String[] {"old","center","shape","fig","skin","come" }, "togethernear");
        System.out.println(stickerNum);
    }

}
