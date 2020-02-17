package org.jessenpan.leetcode.doublepointer;

/**
 * @author jessenpan
 * tag:doublepointer
 */
public class S567PermutationInString {

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }
        int[] s1Array = new int[26], s2Array = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Array[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length(); i++) {
            s2Array[s2.charAt(i) - 'a']++;
        }
        if (s1.length() == s2.length() && !s1.equals(s2)) {
            return compare(s1Array, s2Array) == 0;
        }

        s2Array = new int[26];
        int len = s2.length();
        int left = 0, right = 0;
        while (right < len) {

            s2Array[s2.charAt(right) - 'a']++;
            int compared = compare(s2Array, s1Array);
            if (compared == 0) {
                return true;
            }

            if (compared > 0) {
                while (compared > 0) {
                    s2Array[s2.charAt(left) - 'a']--;
                    left++;
                    compared = compare(s2Array, s1Array);
                    if (compared == 0) {
                        return true;
                    }
                }
            }
            right++;
        }

        return false;
    }

    private int compare(int[] a1, int[] a2) {
        boolean isEqual = true, isGreat = true;
        for (int i = 0; i < 26; i++) {
            if (a1[i] != a2[i]) {
                isEqual = false;
            }
            if (a1[i] < a2[i]) {
                isGreat = false;
            }
        }
        if (isEqual) {
            return 0;
        }
        if (isGreat) {
            return 1;
        }
        return -1;
    }

}
