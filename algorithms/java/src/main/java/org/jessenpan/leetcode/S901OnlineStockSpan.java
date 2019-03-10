package org.jessenpan.leetcode;

import java.util.Stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S901OnlineStockSpan {

    public static class StockSpanner {

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

        private static final int RIPPLE_DISABLE_VAL = 1;

        private Stack<StockItem> stockItemStack = new Stack<>();

        private int counter = 0;

        public StockSpanner() {
        }

        public int next(int price) {
            if (stockItemStack.isEmpty()) {
                stockItemStack.push(new StockItem(price, counter++));
                return RIPPLE_DISABLE_VAL;
            }
            int currentPosition = counter++;
            while (!stockItemStack.isEmpty() && stockItemStack.peek().getPrice() <= price) {
                stockItemStack.pop();
            }
            if (stockItemStack.isEmpty()) {
                stockItemStack.push(new StockItem(price, currentPosition));
                return currentPosition + 1;
            }
            int nextPosition = currentPosition - stockItemStack.peek().getPosition();
            stockItemStack.push(new StockItem(price, currentPosition));
            return nextPosition;
        }
    }

}
