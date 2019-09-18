package org.jessenpan.leetcode.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S969PanCakeSorting {

    public List<Integer> pancakeSort(int[] a) {
        int len = a.length;
        if (len <= 1) {
            return Collections.emptyList();
        }
        List<Integer> list = new ArrayList<>();
        for (int i = len; i >= 1; i--) {

            int pos = findMaxPosition(i, a);
            if (pos == i) {
                continue;
            }

            list.add(pos);
            reverse(a, pos);
            list.add(i);
            reverse(a, i);
        }
        return list;
    }

    private void reverse(int[] a, int num) {
        int i = 0, j = num - 1;
        int temp;
        while (i < j) {
            temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
    }

    private int findMaxPosition(int max, int[] a) {
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if (a[i] == max) {
                return i + 1;
            }
        }
        return -1;
    }

}
