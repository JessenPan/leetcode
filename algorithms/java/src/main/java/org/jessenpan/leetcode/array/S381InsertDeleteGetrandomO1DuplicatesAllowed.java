package org.jessenpan.leetcode.array;

import java.util.*;

/**
 * @author jessenpan
 * tag:array
 */
public class S381InsertDeleteGetrandomO1DuplicatesAllowed {

    public static class RandomizedCollection {

        private int[] array = new int[10];

        private Map<Integer, Set<Integer>> record = new HashMap<>();

        private Random random = new Random(0);

        private int len = 0;

        public RandomizedCollection() {
        }

        public boolean insert(int val) {
            len++;
            if (len > array.length) {
                ensureCapacity();
            }
            boolean isExist = false;
            if (record.containsKey(val)) {
                isExist = true;
            }

            Set<Integer> list = record.computeIfAbsent(val, t -> new HashSet<>());
            list.add(len - 1);
            record.put(val, list);
            array[len - 1] = val;
            return !isExist;
        }

        private void ensureCapacity() {
            int newSize = array.length * 2;
            int[] newArray = new int[newSize];
            System.arraycopy(this.array, 0, newArray, 0, array.length);
            this.array = newArray;
        }

        public boolean remove(int val) {
            if (!record.containsKey(val)) {
                return false;
            }

            if (len == 1) {
                record.clear();
                len--;
                return true;
            }

            Set<Integer> positions = record.get(val);
            int pos = positions.iterator().next();
            if (pos == len - 1) {
                len--;
                if (positions.size() == 1) {
                    record.remove(val);
                } else {
                    positions.remove(0);
                }
                return true;
            }
            array[pos] = array[len - 1];

            if (positions.size() == 1) {
                record.remove(val);
            } else {
                positions.remove(0);
            }
            record.get(array[len - 1]).remove(len - 1);
            record.get(array[len - 1]).add(pos);
            len--;
            return true;
        }

        public int getRandom() {
            return array[random.nextInt(len)];
        }
    }

}
