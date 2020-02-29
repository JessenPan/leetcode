package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 */
public class S858MirrorReflection {

    double EPS = 1e-6;

    //TODO study
    public int mirrorReflection(int p, int q) {
        double x = 0, y = 0;
        double rx = p, ry = q;

        // While it hasn't reached a receptor,...
        while (!(close(x, p) && (close(y, 0) || close(y, p)) || close(x, 0) && close(y, p))) {
            // Want smallest t so that some x + rx, y + ry is 0 or p
            // x + rxt = 0, then t = -x/rx etc.
            double t = 1e9;
            if ((-x / rx) > EPS) {
                t = Math.min(t, -x / rx);
            }
            if ((-y / ry) > EPS) {
                t = Math.min(t, -y / ry);
            }
            if (((p - x) / rx) > EPS) {
                t = Math.min(t, (p - x) / rx);
            }
            if (((p - y) / ry) > EPS) {
                t = Math.min(t, (p - y) / ry);
            }

            x += rx * t;
            y += ry * t;

            if (close(x, p) || close(x, 0)) {
                rx *= -1;
            }
            if (close(y, p) || close(y, 0)) {
                ry *= -1;
            }
        }

        if (close(x, p) && close(y, p)) {
            return 1;
        }
        return close(x, p) ? 0 : 2;
    }

    public boolean close(double x, double y) {
        return Math.abs(x - y) < EPS;
    }

}
