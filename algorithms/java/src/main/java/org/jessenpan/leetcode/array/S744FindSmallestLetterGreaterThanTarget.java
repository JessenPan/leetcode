package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:binarySearch
 */
public class S744FindSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {

        int length = letters.length;
        char nextGreatestLetter = Character.CONTROL; //default value,no meaning
        for (char letter : letters) {
            if (letter > target) {
                nextGreatestLetter = letter;
                break;
            }
        }

        return nextGreatestLetter == Character.CONTROL ? letters[0] : nextGreatestLetter;
    }

}
