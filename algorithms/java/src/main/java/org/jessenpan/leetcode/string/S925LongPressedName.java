package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S925LongPressedName {

    public boolean isLongPressedName(String name, String typed) {
        int lengthOfTyped = typed.length(), lengthOfName = name.length();
        if (lengthOfTyped < lengthOfName) {
            return false;
        }
        if (typed.equals(name)) {
            return true;
        }
        int indexOfTyped = 0, indexOfName = 0;
        char lastChar = 0;
        while (indexOfName < lengthOfName) {
            if (indexOfTyped >= lengthOfTyped) {
                return false;
            }
            if (indexOfName == 0) {
                lastChar = name.charAt(0);
                if (name.charAt(indexOfName) != typed.charAt(indexOfTyped)) {
                    return false;
                }
                indexOfTyped++;
                indexOfName++;
            } else {
                if (name.charAt(indexOfName) == typed.charAt(indexOfTyped)) {
                    lastChar = name.charAt(indexOfName);
                    indexOfName++;
                    indexOfTyped++;
                } else if (lastChar == typed.charAt(indexOfTyped)) {
                    indexOfTyped++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
