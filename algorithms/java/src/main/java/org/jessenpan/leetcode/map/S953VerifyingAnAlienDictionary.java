package org.jessenpan.leetcode.map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S953VerifyingAnAlienDictionary {

    public boolean isAlienSorted(String[] words, String order) {

        int[] orderMap = convertOrderMap(order);
        int length = words.length;
        for (int i = 0; i < length; i++) {
            if (i != (length - 1) && !isDictOrder(orderMap, words[i], words[i + 1])) {
                return false;
            }
        }
        return true;
    }

    private boolean isDictOrder(int[] orderMap, String base, String compared) {
        int baseLength = base.length(), comparedLength = compared.length();
        int minLength = Math.min(baseLength, comparedLength);
        for (int i = 0; i < minLength; i++) {
            if (orderMap[base.charAt(i) - 'a'] > orderMap[compared.charAt(i) - 'a']) {
                return false;
            } else if (orderMap[base.charAt(i) - 'a'] < orderMap[compared.charAt(i) - 'a']) {
                return true;
            }
        }
        return baseLength <= comparedLength;
    }

    private int[] convertOrderMap(String order) {
        int[] orderMap = new int[26];
        int length = order.length();
        for (int i = 0; i < length; i++) {
            orderMap[order.charAt(i) - 'a'] = i;
        }
        return orderMap;
    }

}
