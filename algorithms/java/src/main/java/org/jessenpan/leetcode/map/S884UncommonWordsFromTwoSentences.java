package org.jessenpan.leetcode.map;

import java.util.*;

/**
 * @author jessenpan
 * tag:hashset
 */
public class S884UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String a, String b) {
        Map<String, Integer> aMap = convert2Set(a);
        Map<String, Integer> bMap = convert2Set(b);

        Set<String> list = new HashSet<>(aMap.size() + bMap.size());
        for (Map.Entry<String, Integer> entry : aMap.entrySet()) {
            if (entry.getValue() > 1 || bMap.containsKey(entry.getKey())) {
                bMap.remove(entry.getKey());
            } else if (!bMap.containsKey(entry.getKey())) {
                list.add(entry.getKey());
            }
        }
        for (Map.Entry<String, Integer> entry : bMap.entrySet()) {
            if (entry.getValue() == 1) {
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String[0]);
    }

    private Map<String, Integer> convert2Set(String a) {
        Map<String, Integer> map = new HashMap<>();
        Arrays.stream(a.split(" ")).forEach(str -> {
            Integer count = map.get(str);
            map.put(str, count == null ? 1 : ++count);
        });
        return map;
    }

}
