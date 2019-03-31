package org.jessenpan.leetcode.hashset;

/**
 * @author jessenpan
 * tag:design
 */
public class S705DesignHashSet {

    public static class MyHashSet {

        private static class Entry {

            int key;
            Entry next;

            Entry() {}

            Entry(int key) {
                this.key = key;
            }
        }

        private double loadFactor = 0.75;

        private int count = 0;

        private Entry[] entries = new Entry[100];

        public MyHashSet() {
        }

        public void add(int key) {
            if ((double) count / entries.length > loadFactor) {
                reDistribute();
            }
            Entry[] entries = this.entries;
            if (add(key, entries)) {
                count++;
            }
        }

        private boolean add(int key, Entry[] entries) {
            int pos = key % entries.length;
            if (entries[pos] == null) {
                entries[pos] = new Entry(key);
                return true;
            } else {
                Entry entry = entries[pos];
                while (true) {
                    if (entry.key == key) {
                        return false;
                    }
                    if (entry.next == null) {
                        entry.next = new Entry(key);
                        return true;
                    }
                    entry = entry.next;
                }
            }
        }

        private void reDistribute() {
            Entry[] newEntries = new Entry[entries.length * 2];
            for (Entry oldEntry : entries) {
                if (oldEntry == null) {
                    continue;
                }
                add(oldEntry.key, newEntries);
            }
        }

        public void remove(int key) {
            int pos = key % entries.length;
            if (entries[pos] == null) {
                return;
            }
            Entry entry = entries[pos];
            if (entry.key == key) {
                entries[pos] = entry.next;
                count--;
            } else {
                while (entry.next != null) {
                    if (entry.next.key == key) {
                        count--;
                        entry.next = entry.next.next;
                        return;
                    }
                    entry = entry.next;
                }
            }
        }

        public boolean contains(int key) {
            int pos = key % entries.length;
            if (entries[pos] == null) {
                return false;
            }
            Entry entry = entries[pos];
            while (entry != null) {
                if (entry.key == key) {
                    return true;
                }
                entry = entry.next;
            }
            return false;
        }
    }
}
