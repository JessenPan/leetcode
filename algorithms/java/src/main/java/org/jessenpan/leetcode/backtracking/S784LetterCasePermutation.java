package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S784LetterCasePermutation {

    public List<String> letterCasePermutation(String str) {
        List<String> permutation = new ArrayList<>();
        makePermutation("", permutation, 0, str);
        return permutation;
    }

    private void makePermutation(String subSolution, List<String> permutation, int index, String str) {
        if (index == str.length()) {
            permutation.add(subSolution);
        } else {
            if (!Character.isLetter(str.charAt(index))) {
                makePermutation(subSolution + str.charAt(index), permutation, index + 1, str);
            } else {
                char up = Character.toLowerCase(str.charAt(index));
                makePermutation(subSolution + up, permutation, index + 1, str);

                up = Character.toUpperCase(str.charAt(index));
                makePermutation(subSolution + up, permutation, index + 1, str);
            }
        }
    }

}
