package org.jessenpan.leetcode.string;

import java.util.*;

/**
 * @author jessenpan
 * tag:string
 */
public class S893GroupsOfSpecialEquivalentStrings {

    public int numSpecialEquivGroups(String[] strArray) {
        Map<GroupItem, List<String>> groupItemSet = new HashMap<>();
        int index = 0;
        for (String str : strArray) {
            GroupItem item = new GroupItem(str.length());
            for (int i = 0; i < item.size; i++) {
                if (i % 2 == 0) {
                    item.p0Sum += str.charAt(i) - 'a' + 1;
                } else {
                    item.p1Sum += str.charAt(i) - 'a' + 1;
                }
            }
            if (str.equals("nkgh")) {
                System.out.println(index + "_" + str);
            }
            List<String> strs = groupItemSet.computeIfAbsent(item, k -> new ArrayList<>());
            strs.add(str);
            index++;
        }
        return groupItemSet.size();
    }

    static class GroupItem {

        int size = 0;

        int p0Sum = 0;

        int p1Sum = 0;

        GroupItem(int size) {
            this.size = size;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o)
                return true;
            if (o == null || getClass() != o.getClass())
                return false;
            GroupItem groupItem = (GroupItem) o;
            return size == groupItem.size && p0Sum == groupItem.p0Sum && p1Sum == groupItem.p1Sum;
        }

        @Override
        public int hashCode() {
            return Objects.hash(size, p0Sum, p1Sum);
        }
    }

}
