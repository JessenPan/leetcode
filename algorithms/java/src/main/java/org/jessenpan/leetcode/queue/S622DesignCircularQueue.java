package org.jessenpan.leetcode.queue;

/**
 * @author jessenpan
 * tag:queue
 */
public class S622DesignCircularQueue {

    public static class MyCircularQueue {

        private int[] elements;
        private int head, tail;
        private int size;

        public MyCircularQueue(int k) {
            elements = new int[k];
            head = tail = -1;
        }

        public boolean enQueue(int value) {
            if (head == tail && head == -1) {
                elements[0] = value;
                size++;
                head = tail = 0;
                return true;
            }
            if (size == elements.length) {
                return false;
            }
            if (tail + 1 < elements.length) {
                tail++;
                elements[tail] = value;
            } else {
                tail = (tail + 1) % elements.length;
                elements[tail] = value;
            }
            size++;
            return true;
        }

        public boolean deQueue() {
            if (size == 0) {
                return false;
            }
            if (head == tail) {
                size = 0;
                head = tail = -1;
                return true;
            }
            if (head + 1 < elements.length) {
                head++;
            } else {
                head = (head + 1) % elements.length;
            }
            size--;
            return true;
        }

        public int Front() {
            if (head == -1) {
                return -1;
            }
            return elements[head];
        }

        public int Rear() {
            if (tail == -1) {
                return -1;
            }
            return elements[tail];
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean isFull() {
            return size == elements.length;
        }
    }

}
