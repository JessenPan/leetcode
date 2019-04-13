package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S605CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (flowerbed.length == 1) {
            return flowerbed[0] == 0||n==0;
        }
        int sum = 0, length = flowerbed.length;
        for (int i = 0; i < length; i++) {
            if (i == 0) {
                if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                    sum++;
                    flowerbed[i] = 1;
                }
            } else if (i == (length - 1)) {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                    sum++;
                    flowerbed[i] = 1;
                }
            } else {
                if (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    sum++;
                    flowerbed[i] = 1;
                }
            }
        }
        return sum >= n;
    }
}
