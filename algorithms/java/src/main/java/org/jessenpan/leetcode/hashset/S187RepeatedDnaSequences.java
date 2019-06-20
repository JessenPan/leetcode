package org.jessenpan.leetcode.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jessenpan
 * tag:hashset
 */
public class S187RepeatedDnaSequences {

    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> record = new HashSet<>();
        Set<String> ans = new HashSet<>();
        String tmpStr;
        for (int i = 0; i <= s.length() - 10; i++) {
            tmpStr = s.substring(i, i + 10);
            if (!record.contains(tmpStr)) {
                record.add(tmpStr);
                continue;
            }
            ans.add(tmpStr);
        }
        return new ArrayList<>(ans);
    }

}
