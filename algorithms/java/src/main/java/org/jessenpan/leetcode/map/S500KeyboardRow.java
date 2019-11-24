package org.jessenpan.leetcode.map;

import java.util.*;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S500KeyboardRow {

    private static final Set[] lineWordSet = new Set[3];

    static {
        lineWordSet[0] = new HashSet<>(Arrays.asList('Q', 'q', 'W', 'w', 'E', 'e', 'R', 'r', 'T', 't', 'Y', 'y', 'U', 'u', 'I', 'i', 'O', 'o', 'P', 'p'));
        lineWordSet[1] = new HashSet<>(Arrays.asList('A', 'a', 'S', 's', 'D', 'd', 'F', 'f', 'G', 'g', 'H', 'h', 'J', 'j', 'K', 'k', 'L', 'l'));
        lineWordSet[2] = new HashSet<>(Arrays.asList('Z', 'z', 'X', 'x', 'C', 'c', 'V', 'v', 'B', 'b', 'N', 'n', 'M', 'm'));
    }

    public String[] findWords(String[] words) {
        List<String> foundWords = new LinkedList<>();
        int lengthOfWords = words.length;
        for (int i = 0; i < lengthOfWords; i++) {
            String word = words[i];
            Set keyboardRow = getKeyboardRow(word.charAt(0));
            int lengthOfWord=word.length();
            boolean isSatisfied=true;
            for (int j = 0; j < lengthOfWord; j++) {
                if(!keyboardRow.contains(word.charAt(j))){
                    isSatisfied=false;
                    break;
                }
            }
            if(isSatisfied){
                foundWords.add(word);
            }
        }
        return foundWords.toArray(new String[0]);
    }

    private Set getKeyboardRow(char charInWord) {
        for (int i = 0; i < 3; i++) {
            if (lineWordSet[i].contains(charInWord)) {
                return lineWordSet[i];
            }
        }
        throw new IllegalArgumentException("illegal character");
    }
}
