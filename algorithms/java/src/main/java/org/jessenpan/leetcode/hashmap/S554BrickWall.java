package org.jessenpan.leetcode.hashmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S554BrickWall {

    public int leastBricks(List<List<Integer>> wall) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < wall.size(); i++) {
            int sum = 0;
            for (int j = 0; j < wall.get(i).size() - 1; j++) {
                sum += wall.get(i).get(j);
                map.put(sum, map.getOrDefault(sum, 0) + 1);
            }
        }
        int max = 0;
        for (int val : map.values()) {
            max = Math.max(max, val);
        }
        return wall.size() - max;
    }
}
