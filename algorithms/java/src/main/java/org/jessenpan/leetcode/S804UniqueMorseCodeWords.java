package org.jessenpan.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:string
 */
public class S804UniqueMorseCodeWords {

    private static final String[] MORSE ={
            ".-",
            "-...",
            "-.-.",
            "-..",
            ".",
            "..-.",
            "--.",
            "....",
            "..",
            ".---",
            "-.-",
            ".-..",
            "--",
            "-.",
            "---",
            ".--.",
            "--.-",
            ".-.",
            "...",
            "-",
            "..-",
            "...-",
            ".--",
            "-..-",
            "-.--",
            "--.."
    };
    
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> uniqueMorseRepresentations = new HashSet<>();
        for (String word : words) {
            StringBuilder morseRepresentation = new StringBuilder();
            int lengthOfWord = word.length();
            for (int j = 0; j < lengthOfWord; j++) {
                morseRepresentation.append(MORSE[word.charAt(j) - 'a']);
            }
            uniqueMorseRepresentations.add(morseRepresentation.toString());
        }
        return uniqueMorseRepresentations.size();
    }
}



