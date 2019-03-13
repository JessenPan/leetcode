package org.jessenpan.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author jessenpan
 */
public class S657RobotReturnToOriginTest {

    private S657RobotReturnToOrigin robotReturnToOrigin = new S657RobotReturnToOrigin();

    @Test
    public void test1() {
        boolean isMoveToOrigin = robotReturnToOrigin.judgeCircle("UD");
        assertTrue(isMoveToOrigin);
    }

    @Test
    public void test2() {
        boolean isMoveToOrigin = robotReturnToOrigin.judgeCircle("LL");
        assertFalse(isMoveToOrigin);
    }

}
