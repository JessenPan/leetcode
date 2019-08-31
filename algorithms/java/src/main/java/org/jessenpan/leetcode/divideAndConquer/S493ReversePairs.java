package org.jessenpan.leetcode.divideAndConquer;

/**
 * @author jessenpan
 * tag:divideAndConquer
 */
public class S493ReversePairs {

    private int pair = 0;

    public int reversePairs(int[] nums) {
        if(nums == null || nums != null && nums.length == 0)
            return 0;
        mergeSort(nums, 0, nums.length - 1);
        return pair;
    }

    public void mergeSort(int[] nums,int start,int end) {
        if(start == end)
            return;
        int mid = (start + end)/2;
        mergeSort(nums, start, mid);
        mergeSort(nums, mid + 1, end);
        merge(nums, start, mid, mid + 1, end);
    }

    public void merge(int[] nums,int l1,int r1,int l2,int r2) {
        int ptr1 = l1,ptr2 = l2;
        while(ptr1 <= r1 && ptr2 <= r2) {
            long leftVar = nums[ptr1],rightVar = 2*(long)nums[ptr2];
            if(leftVar > rightVar) {
                pair = pair + r1 - ptr1 + 1;
                ptr2++;
            }else {
                ptr1++;
            }
        }
        int[] newArr = new int[r1 - l1 + 1 + r2 - l2 + 1];
        int idx1 = l1,idx2 = l2,i = 0;
        while(idx1 <= r1 && idx2 <= r2) {
            if(nums[idx1] >= nums[idx2]) {
                newArr[i++] = nums[idx2++];
            }else if(nums[idx1] < nums[idx2]) {
                newArr[i++] = nums[idx1++];
            }
        }
        while(idx1 <= r1)
            newArr[i++] = nums[idx1++];
        while(idx2 <= r2)
            newArr[i++] = nums[idx2++];
        int y = 0;
        for(int x = l1; x <= r2; x++) {
            nums[x] = newArr[y++];
        }
    }

}
