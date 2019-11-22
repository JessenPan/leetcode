package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S419BattleshipsInABoardTest {

    private S419BattleshipsInABoard battleshipsInABoard = new S419BattleshipsInABoard();

    @Test
    public void test1() {
        int t = battleshipsInABoard.countBattleships(new char[][] { { 'X', '.', '.', 'X' }, { '.', '.', '.', 'X' }, { '.', '.', '.', 'X' } });
        Assert.assertEquals(2, t);
    }

}
