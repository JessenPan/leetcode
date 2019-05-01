package org.jessenpan.leetcode.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S599MinimumIndexSumOfTwoLists {

    private int minIndexSum = -1;

    private List<String> restaurants = new ArrayList<>();

    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> restaurantMap = new HashMap<>();
        int lenOfList1 = list1.length;
        for (int i = 0; i < lenOfList1; i++) {
            restaurantMap.put(list1[i], i);
        }
        int lenOfList2 = list2.length;
        for (int i = 0; i < lenOfList2; i++) {
            String restaurant = list2[i];
            Integer index = restaurantMap.get(restaurant);
            if (index != null) {
                if ((index + i) == minIndexSum) {
                    restaurants.add(restaurant);
                } else if (minIndexSum == -1 || (index + i) < minIndexSum) {
                    restaurants.clear();
                    restaurants.add(restaurant);
                    minIndexSum = index + i;
                }
            }
        }

        return restaurants.toArray(new String[0]);
    }

}
