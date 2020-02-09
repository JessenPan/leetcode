package org.jessenpan.leetcode.recursion;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S779KThSymbolInGrammarTest {

    private S779KThSymbolInGrammar kThSymbolInGrammar = new S779KThSymbolInGrammar();

    @Test
    public void test1() {
        int theTarget = kThSymbolInGrammar.kthGrammar(1, 1);
        Assert.assertEquals(0, theTarget);
    }
    
    @Test
    public void test2(){
        int theTarget = kThSymbolInGrammar.kthGrammar(2, 1);
        Assert.assertEquals(0,theTarget);
    }

    @Test
    public void test3(){
        int theTarget = kThSymbolInGrammar.kthGrammar(2, 2);
        Assert.assertEquals(1,theTarget);
    }

    @Test
    public void test4(){
        int theTarget = kThSymbolInGrammar.kthGrammar(4, 5);
        Assert.assertEquals(1,theTarget);
    }
    

}
