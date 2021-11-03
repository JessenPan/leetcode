package org.jessenpan.leetcode.doublepointer;

/**
 * @author jessenpan
 * tag:doublepointer
 */
public class S457CircularArrayLoop {

    //TODO
    private void setZero(int[] nums, int i) {
        int j;
        while (true) { // !(nums[j] == 0 || nums[i]*nums[j]<0)
            j = (i + nums[i] + 5000 * nums.length) % nums.length;
            if (nums[j] == 0 || nums[i] * nums[j] < 0) {
                nums[i] = 0;
                break;
            }
            nums[i] = 0;
            i = j;
        }
    }

    // beat 100%
    public boolean circularArrayLoop(int[] nums) {
        if (nums.length == 0)
            return false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                continue;
            int lastJ, lastK;
            int j = i, k = i;

            while (true) {
                lastJ = j;
                j = (j + nums[j] + 5000 * nums.length) % nums.length;
                if (nums[lastJ] * nums[j] < 0 || nums[j] == 0 || lastJ == j) {
                    setZero(nums, i);
                    break;
                }
                lastK = k;
                k = (k + nums[k] + 5000 * nums.length) % nums.length;
                if (nums[lastK] * nums[k] < 0 || nums[k] == 0 || lastK == k) {
                    setZero(nums, i);
                    break;
                }
                lastK = k;
                k = (k + nums[k] + 5000 * nums.length) % nums.length;
                if (nums[lastK] * nums[k] < 0 || nums[k] == 0 || lastK == k) {
                    setZero(nums, i);
                    break;
                }
                if (j == k)
                    return true;
            }
        }
        return false;
    }
}
