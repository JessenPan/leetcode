package org.jessenpan.leetcode.stack;

import org.junit.Test;

import java.util.List;

import static org.jessenpan.leetcode.stack.S341FlattenNestedListIterator.NestedInteger;

/**
 * @author jessenpan
 */
public class S341FlattenNestedListIteratorTest {

    public static class NestedIntegerImpl implements NestedInteger {

        private Integer integer;

        private List<NestedInteger> list;

        @Override
        public boolean isInteger() {
            return integer != null;
        }

        @Override
        public Integer getInteger() {
            return integer;
        }

        @Override
        public List<NestedInteger> getList() {
            return list;
        }
    }

    @Test
    public void test1() {

    }

}
