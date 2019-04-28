package org.jessenpan.leetcode.string;

import java.util.*;

/**
 * @author jessenpan
 * tag:string
 */
public class S893GroupsOfSpecialEquivalentStrings {

    public int numSpecialEquivGroups(String[] strArray) {
        Set<GroupItem> groupItemSet = new HashSet<>();
        int index = 0;
        for (String str : strArray) {
            GroupItem item = new GroupItem(str.length());
            for (int i = 0; i < item.size; i++) {
                if (i % 2 == 0) {
                    item.evenChars[str.charAt(i) - 'a']++;
                } else {
                    item.oddChars[str.charAt(i) - 'a']++;
                }
            }
            groupItemSet.add(item);
            index++;
        }
        return groupItemSet.size();
    }

    static class GroupItem {

        int size = 0;

        int[] evenChars = new int[26];

        int[] oddChars = new int[26];

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
            return size == groupItem.size && Arrays.equals(evenChars, groupItem.evenChars) && Arrays.equals(oddChars, groupItem.oddChars);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(size);
            result = 31 * result + Arrays.hashCode(evenChars);
            result = 31 * result + Arrays.hashCode(oddChars);
            return result;
        }
    }

}
