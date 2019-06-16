package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:string
 */
public class S553OptimalDivision {

    public String optimalDivision(int[] nums) {
        if (nums.length == 0) {
            return "";
        }
        if (nums.length == 1) {
            return nums[0] + "";
        }
        if (nums.length == 2) {
            return nums[0] + "/" + nums[1];
        }
        StringBuilder ans = new StringBuilder();
        ans.append(nums[0]).append("/(");
        for (int i = 1; i < nums.length - 1; i++) {
            ans.append(nums[i]).append("/");
        }
        ans.append(nums[nums.length - 1]).append(")");
        return ans.toString();
    }

}
