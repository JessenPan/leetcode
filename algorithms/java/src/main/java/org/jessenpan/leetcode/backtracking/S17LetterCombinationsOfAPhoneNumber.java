package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S17LetterCombinationsOfAPhoneNumber {

    private static Map<Character, String> map = new HashMap<>();

    static {
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
    }

    private List<String> letters = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return Collections.emptyList();
        }
        findLetterCombinations(digits, 0, "");
        return letters;
    }

    private void findLetterCombinations(String digits, int index, String subStr) {
        if (index == digits.length()) {
            letters.add(subStr);
            return;
        }

        String strNum = map.get(digits.charAt(index));
        for (int i = 0; i < strNum.length(); i++) {

            findLetterCombinations(digits, index + 1, subStr + strNum.charAt(i));
        }
    }

}
