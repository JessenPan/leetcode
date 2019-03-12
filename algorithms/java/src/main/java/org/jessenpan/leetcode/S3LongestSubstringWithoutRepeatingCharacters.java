package org.jessenpan.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 */
public class S3LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        char[] stringCharArray = s.toCharArray();
        int lengthOfLongestSubstring = 0;
        int lengthOfString = stringCharArray.length;
        for (int i = 0; i < lengthOfString; i++) {
            Set<Character> subStringSet = new HashSet<Character>();
            for (int j = i; j < lengthOfString; j++) {
                if (!subStringSet.add(stringCharArray[j])) {
                    break;
                }
            }
            if (subStringSet.size() > lengthOfLongestSubstring) {
                lengthOfLongestSubstring = subStringSet.size();
            }
        }
        return lengthOfLongestSubstring;
    }
}
