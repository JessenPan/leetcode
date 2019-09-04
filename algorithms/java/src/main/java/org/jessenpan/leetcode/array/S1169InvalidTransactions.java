package org.jessenpan.leetcode.array;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author jessenpan
 * tag:array
 */
public class S1169InvalidTransactions {

    public List<String> invalidTransactions(String[] transactions) {
        List<Trans> transList = new ArrayList<>();
        int len = transactions.length;
        for (int i = 0; i < len; i++) {

            String[] transArray = transactions[i].split(",");
            Trans trans = new Trans();
            trans.name = transArray[0];
            trans.time = Integer.parseInt(transArray[1]);
            trans.amount = Integer.parseInt(transArray[2]);
            trans.city = transArray[3];
            trans.i = i;
            transList.add(trans);
        }

        Map<String, List<Trans>> map = transList.stream().collect(Collectors.groupingBy(trans -> trans.name));
        Set<String> rs = new HashSet<>();

        for (List<Trans> list : map.values()) {
            list.sort(Comparator.comparingInt(o -> o.time));
            Trans[] transArray = list.toArray(new Trans[0]);
            len = transArray.length;
            for (int i = 0; i < len; i++) {
                if (transArray[i].amount > 1000) {
                    rs.add(transactions[transArray[i].i]);
                }
                for (int j = i + 1; j < len; j++) {
                    if (transArray[j].time - transArray[i].time > 60) {
                        break;
                    }
                    if (!transArray[i].city.equals(transArray[j].city)) {
                        rs.add(transactions[transArray[i].i]);
                        rs.add(transactions[transArray[j].i]);
                    }
                }
            }
        }
        return new ArrayList<>(rs);
    }

    static class Trans {

        String name;
        int time;
        int amount;
        String city;
        int i;
    }

}
