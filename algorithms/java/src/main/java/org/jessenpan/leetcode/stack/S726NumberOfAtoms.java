package org.jessenpan.leetcode.stack;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:stack
 */
public class S726NumberOfAtoms {

    public String countOfAtoms(String formula) {
        if (formula == null || formula.isEmpty()) {
            return "";
        }
        Map<String, Integer> records = new HashMap<>();

        int len = formula.length();
        int lastIdx = -1;
        for (int i = 0; i < len; i++) {

        }

        StringBuilder sb = new StringBuilder();
        records.forEach((atom, num) -> {
            sb.append(atom);
            if (num > 1) {
                sb.append(num);
            }
        });
        return sb.toString();
    }

}
