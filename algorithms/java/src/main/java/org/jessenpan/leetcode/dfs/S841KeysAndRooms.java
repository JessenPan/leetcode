package org.jessenpan.leetcode.dfs;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jessenpan
 * tag:dfs
 */
public class S841KeysAndRooms {

    private Set<Integer> hasVisited = new HashSet<>();

    private List<List<Integer>> rooms;

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        if (rooms.size() <= 1) {
            return true;
        }
        this.rooms = rooms;

        List<Integer> firsts = rooms.get(0);
        if (firsts.isEmpty()) {
            return false;
        }
        hasVisited.add(0);
        for (Integer first : firsts) {
            traverse(first);
        }
        return hasVisited.size() == rooms.size();
    }

    private void traverse(Integer element) {

        if (hasVisited.contains(element)) {
            return;
        }
        hasVisited.add(element);
        List<Integer> keys = rooms.get(element);
        if (keys.isEmpty()) {
            return;
        }
        for (Integer key : keys) {
            traverse(key);
            hasVisited.add(key);
        }
    }

}
