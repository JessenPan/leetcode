package org.jessenpan.leetcode.string;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 */
public class S804UniqueMorseCodeWordsTest {
    
    private S804UniqueMorseCodeWords uniqueMorseCodeWords=new S804UniqueMorseCodeWords();
    
    @Test
    public void test1(){
        int theUniqueNum=uniqueMorseCodeWords.uniqueMorseRepresentations(new String[]{"gin", "zen", "gig", "msg"});
        assertEquals(theUniqueNum,2);
    }

}
