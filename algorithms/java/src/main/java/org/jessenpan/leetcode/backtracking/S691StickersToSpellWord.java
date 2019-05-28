package org.jessenpan.leetcode.backtracking;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S691StickersToSpellWord {

    public int minStickers(String[] stickers, String target) {
        int[] targetArray = convertStr2Array(target);

        countSticker(0, new HashSet<>(Arrays.asList(stickers)), targetArray);
        return minCount;
    }

    private int[] convertStr2Array(String str) {
        int[] targetArray = new int[26];
        for (int i = 0; i < str.length(); i++) {
            targetArray[str.charAt(i) - 'a']++;
        }
        return targetArray;
    }

    private void countSticker(int count, Set<String> asList, int[] targetArray) {
        if (isArrayZero(targetArray)) {
            this.minCount = minCount == -1 ? count : Math.min(count, minCount);
            return;
        }

        for (String str : asList) {
            int[] array = convertStr2Array(str);
            int[] newTargetArrays = Arrays.copyOf(targetArray, 26);
            Set<String> newSet = new HashSet<>(asList);
            int removedSticker = removeStickers(array, newTargetArrays);
            newSet.remove(str);
            countSticker(count + removedSticker, newSet, newTargetArrays);
        }

    }

    private int removeStickers(int[] array, int[] newTargetArrays) {
        int count = 0;
        boolean removed;
        while (true) {
            removed = false;
            for (int i = 0; i < 26; i++) {
                if (array[i] != 0 && newTargetArrays[i] != 0) {
                    removed = true;
                    if (array[i] >= newTargetArrays[i]) {
                        newTargetArrays[i] = 0;
                    } else {
                        newTargetArrays[i] = newTargetArrays[i] - array[i];
                    }
                }
            }
            if (removed) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    private int minCount = -1;

    private boolean isArrayZero(int[] targetArray) {
        for (int i = 0; i < 26; i++) {
            if (targetArray[i] != 0) {
                return false;
            }
        }
        return true;
    }

}
