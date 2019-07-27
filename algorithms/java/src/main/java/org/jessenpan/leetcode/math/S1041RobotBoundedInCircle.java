package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S1041RobotBoundedInCircle {

    public boolean isRobotBounded(String instructions) {
        int dir = 0; // 方向: 0上   1右   2下   3左
        int x = 0;   // x轴坐标
        int y = 0;   // y轴坐标
        char ch;
        for (int i = 0; i < instructions.length(); i++) {
            ch = instructions.charAt(i); // 逐个读取字符
            if (ch == 'L') {
                if (dir == 0)
                    dir = 3;
                else
                    dir--;
            }
            if (ch == 'R') {
                if (dir == 3)
                    dir = 0;
                else
                    dir++;
            }
            if (ch == 'G') {
                switch (dir) {
                    case 0:
                        y++;
                        break;
                    case 1:
                        x++;
                        break;
                    case 2:
                        y--;
                        break;
                    case 3:
                        x--;
                        break;
                }
            }
        }
        // 情况1: 走完一轮回到原点
        if (x == 0 && y == 0) {
            return true;
        }
        // 情况2: 走完一轮,只要方向改变了(即不是直走了),最后不管走多少轮总会回到起点
        if (dir != 0) {
            return true;
        }
        return false;

    }
}
