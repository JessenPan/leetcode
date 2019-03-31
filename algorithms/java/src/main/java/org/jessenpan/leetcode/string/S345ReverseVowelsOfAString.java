package org.jessenpan.leetcode.string;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author jessenpan
 * tag:string
 */
public class S345ReverseVowelsOfAString {

    private static final Set<Character> VOWELS = new HashSet<>();

    static {
        VOWELS.add('a');
        VOWELS.add('e');
        VOWELS.add('i');
        VOWELS.add('o');
        VOWELS.add('u');
        VOWELS.add('A');
        VOWELS.add('E');
        VOWELS.add('I');
        VOWELS.add('O');
        VOWELS.add('U');
    }

    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if(VOWELS.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if(VOWELS.contains(s.charAt(i))){
                sb.append(stack.pop());
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
