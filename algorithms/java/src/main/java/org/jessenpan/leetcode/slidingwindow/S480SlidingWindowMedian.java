package org.jessenpan.leetcode.slidingwindow;

import java.util.PriorityQueue;

/**
 * @author jessenpan
 * tag:slidingwindow
 */
public class S480SlidingWindowMedian {

    public double[] medianSlidingWindow(int[] nums, int k) {
        int N = nums.length;
        double[] res = new double[N - k + 1];
        if (N == 0)
            return res;

        pqMax = new PriorityQueue<Integer>((Integer n1, Integer n2) -> {
            if (n1 < n2)
                return 1;
            else if (n1 == n2)
                return 0;
            else
                return -1;
        });
        pqMin = new PriorityQueue<Integer>();
        int index = 0; // 在res中移动的指针
        for (int i = 0; i < N; ++i) {
            // 和数据流求中位数思路一致, 当元素<=pivot时加入大顶堆, 默认无元素时加入大顶堆
            if (pqMax.size() == 0 || pqMax.peek() >= nums[i])
                pqMax.offer(nums[i]);
            else
                pqMin.offer(nums[i]);
            balance(); // 堆平衡调整
            // 对元素淘汰
            if (i >= k) {
                if (nums[i - k] > pqMax.peek())
                    pqMin.remove(nums[i - k]);
                else
                    pqMax.remove(nums[i - k]);
            }
            balance(); // 堆平衡调整
            // 堆结果加入
            if (i >= k - 1) {
                if ((k & 0x01) == 1)
                    res[index++] = pqMax.peek();
                else
                    res[index++] = ((double) pqMax.peek() + (double) pqMin.peek()) / 2.0;
            }
        }

        return res;
    }

    // 保持两侧堆元素数量 0<=(#pqMax - #pqMin)<=1
    private void balance() {
        while (pqMax.size() > pqMin.size() + 1)
            pqMin.offer(pqMax.poll());
        while (pqMax.size() < pqMin.size())
            pqMax.offer(pqMin.poll());
    }

    private PriorityQueue<Integer> pqMax; // 大顶堆
    private PriorityQueue<Integer> pqMin; // 小顶堆
}
