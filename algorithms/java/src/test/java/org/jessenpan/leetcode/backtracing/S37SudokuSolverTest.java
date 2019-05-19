package org.jessenpan.leetcode.backtracing;

import org.jessenpan.leetcode.backtracking.S37SudokuSolver;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S37SudokuSolverTest {

    private S37SudokuSolver sudokuSolver = new S37SudokuSolver();
    
    @Test
    public void test1(){
        sudokuSolver.solveSudoku(new char[][]{
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        });
    }

}
