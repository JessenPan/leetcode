package org.jessenpan.leetcode;

import java.util.Iterator;

/**
 * @author jessenpan
 * tag:design
 */
public class S284PeekingIterator {

    class PeekingIterator implements Iterator<Integer> {

        private Iterator<Integer> iterator;
        private Integer peek;

        public PeekingIterator(Iterator<Integer> iterator) {
            this.iterator = iterator;
        }

        public Integer peek() {
            if (peek == null) {
                peek = iterator.next();
            }
            return peek;
        }

        @Override
        public Integer next() {
            if (peek != null) {
                Integer copy = peek;
                peek = null;
                return copy;
            } else {
                return iterator.next();
            }
        }

        @Override
        public boolean hasNext() {
            if (peek != null) {
                return true;
            }
            return iterator.hasNext();
        }
    }

}
