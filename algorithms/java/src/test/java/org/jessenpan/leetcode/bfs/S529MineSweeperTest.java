package org.jessenpan.leetcode.bfs;

import org.junit.Test;

/**
 * @author jessenpan
 */
public class S529MineSweeperTest {

    private S529MineSweeper mineSweeper = new S529MineSweeper();

    @Test
    public void test1() {
        char[][] rs = mineSweeper.updateBoard(new char[][] { { 'E', 'E', 'E', 'E', 'E' }, { 'E', 'E', 'M', 'E', 'E' }, { 'E', 'E', 'E', 'E', 'E' }, { 'E', 'E', 'E', 'E', 'E' } }, new int[] { 3, 0 });
    }


    @Test
    public void test2() {
        char[][] rs = mineSweeper.updateBoard(new char[][] { 
                {'B', '1', 'E', '1', 'B' }, 
                { 'B', '1', 'M', '1', 'B' }, 
                { 'B', '1', '1', '1', 'B' },
                { 'B', 'B', 'B', 'B', 'B' } 
                }, new int[] { 1,2});
    }
}
