package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 */
public class S223RectangleArea {

    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int area1 = (C - A) * (D - B);
        int area2 = (G - E) * (H - F);
        if (E >= C || G <= A || H <= B || F >= D) {
            // 不相交
            return area1 + area2;
        }

        int leftX = Math.max(A, E);
        int leftY = Math.max(B, F);
        int rightX = Math.min(C, G);
        int rightY = Math.min(D, H);
        int commonArea = (rightX - leftX) * (rightY - leftY);
        return area1 + area2 - commonArea;
    }

}
