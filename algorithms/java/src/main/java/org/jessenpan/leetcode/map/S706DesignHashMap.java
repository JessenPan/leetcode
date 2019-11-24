package org.jessenpan.leetcode.map;

/**
 * @author jessenpan
 * tag:design
 */
public class S706DesignHashMap {

    public static class MyHashMap {

        private static class Entry {

            int key;
            int value;
            Entry next;

            Entry() {}

            Entry(int key, int value) {
                this.key = key;
                this.value = value;
            }

            Entry(int key, int value, Entry next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }
        }

        private double loadFactor = 0.75;

        private int count = 0;

        private Entry[] entries = new Entry[100];

        public MyHashMap() {
        }

        public void put(int key, int value) {
            if ((double) count / entries.length > loadFactor) {
                reDistribute();
            }
            Entry[] entries = this.entries;
            put(key, value, entries);
        }

        private void put(int key, int value, Entry[] entries) {
            int pos = key % entries.length;
            Entry entry = entries[pos];
            if (entry == null) {
                entries[pos] = new Entry(key, value);
            } else {
                while (true) {
                    if (entry.key == key) {
                        entry.value = value;
                        return;
                    } else if (entry.next == null) {
                        entry.next = new Entry(key, value);
                        return;
                    }
                    entry = entry.next;
                }
            }
        }

        private void reDistribute() {
            Entry[] newEntries = new Entry[entries.length * 2];
            for (Entry oldEntry : entries) {
                while (oldEntry != null) {
                    put(oldEntry.key, oldEntry.value, newEntries);
                    oldEntry = oldEntry.next;
                }
            }
            this.entries = newEntries;
        }

        public int get(int key) {
            int pos = key % entries.length;
            Entry entry = entries[pos];
            if (entry == null) {
                return -1;
            }
            while (entry != null) {
                if (entry.key == key) {
                    return entry.value;
                }
                entry = entry.next;
            }
            return -1;
        }

        public void remove(int key) {
            int pos = key % entries.length;
            Entry entry = entries[pos];
            if (entry == null) {
                return;
            }
            if (entry.key == key) {
                entry = entry.next;
                entries[pos] = entry;
                count--;
            } else {
                while (entry.next != null) {
                    if (entry.next.key == key) {
                        entry.next = entry.next.next;
                        count--;
                        return;
                    } else {
                        entry = entry.next;
                    }
                }
            }
        }
    }

}
