package org.jessenpan.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S594LongestHarmoniousSubsequence {

    private int maxLen = 0;

    public int findLHS(int[] nums) {
        Map<Integer, Integer> record = new HashMap<>();
        for (int num : nums) {
            Integer cnt = record.get(num);
            cnt = cnt == null ? 1 : cnt + 1;
            record.put(num, cnt);
        }

        for (Map.Entry<Integer, Integer> entry : record.entrySet()) {
            Integer num = entry.getKey();
            Integer cntOfDesc = record.get(num - 1);
            if (cntOfDesc != null && cntOfDesc + entry.getValue() > maxLen) {
                maxLen = cntOfDesc + entry.getValue();
            }

            Integer cntOfIns = record.get(num + 1);
            if (cntOfIns != null && cntOfIns + entry.getValue() > maxLen) {
                maxLen = cntOfIns + entry.getValue();
            }
        }
        return maxLen;
    }
}
