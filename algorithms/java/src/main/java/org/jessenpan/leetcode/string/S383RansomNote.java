package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S383RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] ransomNoteArray = new int[26], magazineArray = new int[26];
        int lengthOfRansomNote = ransomNote.length(), lengthOfMagazine = magazine.length();
        for (int i = 0; i < lengthOfRansomNote; i++) {
            ransomNoteArray[ransomNote.charAt(i) - 'a']++;
        }
        for (int i = 0; i < lengthOfMagazine; i++) {
            magazineArray[magazine.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (ransomNoteArray[i] > magazineArray[i]) {
                return false;
            }
        }
        return true;
    }
}
