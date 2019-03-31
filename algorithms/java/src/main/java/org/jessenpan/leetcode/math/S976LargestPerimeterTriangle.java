package org.jessenpan.leetcode.math;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:math
 */
public class S976LargestPerimeterTriangle {

    public int largestPerimeter(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        for (int i = length - 1; i >= 2; i--) {
            if (isTriangle(array, i)) {
                return array[i] + array[i - 1] + array[i - 2];
            }
        }
        return 0;
    }

    private boolean isTriangle(int[] triangles, int i) {
        return triangles[i] + triangles[i - 1] > triangles[i - 2] && triangles[i] - triangles[i - 1] < triangles[i - 2];
    }
}
