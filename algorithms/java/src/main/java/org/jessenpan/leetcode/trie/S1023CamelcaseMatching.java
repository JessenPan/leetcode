package org.jessenpan.leetcode.trie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:trie
 */
public class S1023CamelcaseMatching {

    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> matches = new ArrayList<>();

        for (String query : queries) {
            boolean isMatch = isMatch(query, pattern);
            matches.add(isMatch);
        }
        return matches;
    }

    private boolean isMatch(String query, String pattern) {
        if (pattern.isEmpty()) {
            return query.isEmpty() || isAllLowercase(query);
        }
        if (query.isEmpty()) {
            return false;
        }

        char firstOfQuery = query.charAt(0);

        if (firstOfQuery == pattern.charAt(0)) {
            return isMatch(query.substring(1), pattern.substring(1));
        } else {
            if (Character.isUpperCase(firstOfQuery)) {
                return false;
            } else {
                return isMatch(query.substring(1), pattern);
            }
        }

    }

    private boolean isAllLowercase(String query) {
        int len = query.length();
        for (int i = 0; i < len; i++) {
            if (Character.isUpperCase(query.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
