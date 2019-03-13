package org.jessenpan.leetcode;

/**
 * @author jessenpan
 */
public class S657RobotReturnToOrigin {

    private static final char DOWN = 'D';

    private static final char UP = 'U';

    private static final char RIGHT = 'R';

    private static final char LEFT = 'L';

    public boolean judgeCircle(String moves) {
        int horizontalScore = 0, vertical = 0;
        int lengthOfMoves = moves.length();
        for (int i = 0; i < lengthOfMoves; i++) {
            char move = moves.charAt(i);
            switch (move) {
                case UP:
                    vertical++;
                    break;
                case DOWN:
                    vertical--;
                    break;
                case LEFT:
                    horizontalScore++;
                    break;
                case RIGHT:
                    horizontalScore--;
                    break;
            }
        }
        return horizontalScore == vertical && vertical == 0;
    }
}
