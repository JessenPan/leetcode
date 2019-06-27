package org.jessenpan.leetcode.stack;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @author jessenpan
 * tag:stack
 */
public class S341FlattenNestedListIterator {

    public interface NestedInteger {

        boolean isInteger();

        Integer getInteger();

        List<NestedInteger> getList();
    }

    public static class NestedIterator implements Iterator<Integer> {

        private List<Integer> list = new LinkedList<>();

        private Iterator<Integer> iterator;

        public NestedIterator(List<NestedInteger> nestedList) {
            extractList(nestedList);
            this.iterator = list.iterator();
        }

        private void extractList(List<NestedInteger> nestedList) {
            for (NestedInteger nestedInteger : nestedList) {
                if (nestedInteger.isInteger()) {
                    list.add(nestedInteger.getInteger());
                } else {
                    extractList(nestedInteger.getList());
                }
            }
        }

        @Override
        public Integer next() {
            return iterator.next();
        }

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }
    }

}
