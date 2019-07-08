package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S795NumberOfSubarraysWithBoundedMaximumTest {

    private S795NumberOfSubarraysWithBoundedMaximum numberOfSubarraysWithBoundedMaximum = new S795NumberOfSubarraysWithBoundedMaximum();

    @Test
    public void test1() {
        int num = numberOfSubarraysWithBoundedMaximum.numSubarrayBoundedMax(new int[] { 2, 1, 4, 3 }, 2, 3);
        Assert.assertEquals(3, num);
    }

    @Test
    public void test2() {
        int num = numberOfSubarraysWithBoundedMaximum.numSubarrayBoundedMax(new int[] { 16, 69, 88, 85, 79, 87, 37, 33, 39, 34 }, 55, 57);
        Assert.assertEquals(0, num);
    }

    @Test
    public void test3() {
        int num = numberOfSubarraysWithBoundedMaximum.numSubarrayBoundedMax(new int[] { 2, 9, 2, 5, 6 }, 2, 8);
        Assert.assertEquals(7, num);
    }

    @Test
    public void test4() {
        int num = numberOfSubarraysWithBoundedMaximum.numSubarrayBoundedMax(new int[] { 73, 55, 36, 5, 55, 14, 9, 7, 72, 52 }, 32, 69);
        Assert.assertEquals(22, num);
    }

    @Test
    public void test5() {
        int num = numberOfSubarraysWithBoundedMaximum.numSubarrayBoundedMax(new int[] { 876, 880, 482, 260, 132, 421, 732, 703, 795, 420, 871, 445, 400, 291, 358, 589, 617, 202, 755, 810, 227, 813, 549, 791, 418, 528, 835, 401, 526, 584, 873, 662, 13, 314, 988, 101, 299, 816, 833, 224, 160, 852, 179, 769, 646, 558, 661, 808, 651, 982, 878, 918, 406, 551, 467, 87, 139, 387, 16, 531, 307, 389, 939, 551, 613, 36, 528, 460, 404, 314, 66, 111, 458, 531, 944, 461, 951, 419, 82, 896, 467, 353, 704, 905, 705, 760, 61, 422, 395, 298, 127, 516, 153, 299, 801, 341, 668, 598, 98, 241 }, 658, 719);
        Assert.assertEquals(19, num);
    }
}
