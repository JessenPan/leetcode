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

    @Test
    public void test4() {
        int stickerNum = stickersToSpellWord.minStickers(new String[] {"hour","supply","plain","fruit","pretty","touch","property" }, "sharpcenter");
        System.out.println(stickerNum);
    }

    @Test
    public void test5() {
        int stickerNum = stickersToSpellWord.minStickers(new String[] {"write","their","read","quiet","against","down","process","check" }, "togetherhand");
        System.out.println(stickerNum);
    }

    @Test
    public void test6() {
        int stickerNum = stickersToSpellWord.minStickers(new String[]  {"control","heart","interest","stream","sentence","soil","wonder","them","month","slip","table","miss","boat","speak","figure","no","perhaps","twenty","throw","rich","capital","save","method","store","meant","life","oil","string","song","food","am","who","fat","if","put","path","come","grow","box","great","word","object","stead","common","fresh","the","operate","where","road","mean"}, "stoodcrease");
        System.out.println(stickerNum);
    }

    
    
}
