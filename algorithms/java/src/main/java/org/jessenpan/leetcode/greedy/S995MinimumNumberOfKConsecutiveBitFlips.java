package org.jessenpan.leetcode.greedy;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S995MinimumNumberOfKConsecutiveBitFlips {

    public int minKBitFlips(int[] A, int K) {
        int N = A.length;
        int[] hint = new int[N];
        int ans = 0, flip = 0;

        // 当我们翻转子数组形如 A[i], A[i+1], ..., A[i+K-1]
        // 我们可以在此位置置反翻转状态，并且在位置 i+K 设置一个提醒，告诉我们在那里也要置反翻转状态
        for (int i = 0; i < N; i++) {
            flip ^= hint[i];
            // 我们是否必须翻转从此开始的子数组
            if (A[i] == flip) {
                ans++;  // 翻转子数组 A[i] 至 A[i+K-1]
                if (i + K > N) {
                    return -1;  // 如果没办法翻转整个子数组了，那么就不可行
                }
                flip ^= 1;
                if (i + K < N) {
                    hint[i + K] ^= 1;
                }
            }
        }

        return ans;
    }

}
