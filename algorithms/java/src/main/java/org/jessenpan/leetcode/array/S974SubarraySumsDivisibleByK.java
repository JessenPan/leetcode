package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S974SubarraySumsDivisibleByK {

    //TODO 
    public int subarraysDivByK(int[] A, int K) {
        int N = A.length, sum = 0, ans = 0;
        int[] map = new int[K];
        map[0] = 1;
        for (int i = 1; i <= N; i++) {
            sum = sum + A[i-1];
            int key = (sum % K + K) % K;
            ans += map[key];
            map[key]++;
        }
        return ans;
    }

}
