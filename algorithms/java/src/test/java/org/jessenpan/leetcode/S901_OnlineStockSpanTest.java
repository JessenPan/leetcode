package org.jessenpan.leetcode;

import org.jessenpan.leetcode.S901OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * @author jessenpan
 * @date 2019-03-06 16:58
 */
public class S901_OnlineStockSpanTest {

    private S901OnlineStockSpan.StockSpanner onlineStockSpan = new S901OnlineStockSpan.StockSpanner();

    @Test
    public void test1() {
        assertEquals(1, onlineStockSpan.next(100));
        assertEquals(1, onlineStockSpan.next(80));
        assertEquals(1, onlineStockSpan.next(60));
        assertEquals(2, onlineStockSpan.next(70));
        assertEquals(1, onlineStockSpan.next(60));
        assertEquals(4, onlineStockSpan.next(75));
        assertEquals(6, onlineStockSpan.next(85));
        assertEquals(7, onlineStockSpan.next(85));
    }

    @Test
    public void test2() {
        assertEquals(1, onlineStockSpan.next(31));
        assertEquals(2, onlineStockSpan.next(41));
        assertEquals(3, onlineStockSpan.next(48));
        assertEquals(4, onlineStockSpan.next(59));
        assertEquals(5, onlineStockSpan.next(79));
    }

}
