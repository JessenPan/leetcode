package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S771JewelsAndStonesTest {

    private S771JewelsAndStones jewelsAndStones = new S771JewelsAndStones();

    @Test
    public void test1() {
        int jewelNumInStone = jewelsAndStones.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, jewelNumInStone);
    }
    
    @Test
    public void test2(){
        int jewelNumInStone = jewelsAndStones.numJewelsInStones("z", "ZZ");
        assertEquals(0, jewelNumInStone);
    }

}
