package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 */
public class S729MyCalendarI {

    public static class MyCalendar {

        static class Node {

            int start = 0;
            int end = 0;

            Node(int start, int end) {
                this.start = start;
                this.end = end;
            }
        }

        private List<Node> list = new ArrayList<>();

        public boolean book(int start, int end) {
            for (int i = 0; i < list.size(); i++) {
                int existStart = list.get(i).start;
                int existEnd = list.get(i).end;
                if ((existStart <= start && start < existEnd) || (existStart < end && end <= existEnd) || (start <= existStart && end >= existEnd)) {
                    return false;
                }
            }
            list.add(new Node(start, end));
            return true;
        }
    }

}
