package org.jessenpan.leetcode.stack;

import java.util.Stack;

/**
 * @author jessenpan
 * @date 2019-03-06 16:52
 */
public class S901_OnlineStockSpan {

    static class StockItem {

        private int price;

        private int position;

        public StockItem(int price, int position) {
            this.price = price;
            this.position = position;
        }

        public int getPrice() {
            return price;
        }

        public int getPosition() {
            return position;
        }
    }

    public static class StockSpanner {

        private Stack<StockItem> stockItemStack = new Stack<>();
        
        public StockSpanner() {
        }

        public int next(int price) {

        }
    }

}
