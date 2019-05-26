package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S212WordSearchII {

    private char[][] board;

    private List<String> foundWords = new ArrayList<>();

    static class Node {

        private String str;

        private boolean isEnd = false;

        private Node[] children = new Node[26];
    }

    private Node root = new Node();

    private int row, col;

    public List<String> findWords(char[][] board, String[] words) {

        this.board = board;
        for (String word : words) {
            Node p = root;
            for (int j = 0; j < word.length(); j++) {
                if (p.children[word.charAt(j) - 'a'] == null) {
                    p.children[word.charAt(j) - 'a'] = new Node();
                }
                p = p.children[word.charAt(j) - 'a'];
            }
            p.str = word;
            p.isEnd = true;
        }
        row = board.length;
        col = board[0].length;
        Node p = root;
        for (int i = 0; i < 26; i++) {
            if (p.children[i] == null) {
                continue;
            }
            for (int j = 0; j < row; j++) {
                for (int k = 0; k < col; k++) {
                    if (board[j][k] - 'a' == i) {
                        exist(new Point(j, k), p.children[i]);
                    }
                }
            }
        }
        return foundWords;
    }

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private boolean exist(Point point, Node p) {

        if (p.isEnd) {
            foundWords.add(p.str);
            return true;
        }

        boolean isExisted;
        for (int j = 0; j < 26; j++) {
            if (p.children[j] == null) {
                continue;
            }
            for (int i = 0; i < 4; i++) {
                Point newPoint = createNextPoint(i, point);
                if (newPoint.x >= 0 && newPoint.x < row && newPoint.y >= 0 && newPoint.y < col) {
                    board[point.x][point.y] = '1';
                    isExisted = exist(newPoint, index + 1);
                    board[point.x][point.y] = word.charAt(index);
                    if (isExisted) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private Point createNextPoint(int index, Point point) {
        switch (index) {
            case 0:
                return new Point(point.x - 1, point.y);
            case 1:
                return new Point(point.x, point.y + 1);
            case 2:
                return new Point(point.x + 1, point.y);
            case 3:
                return new Point(point.x, point.y - 1);
        }
        return null;
    }

}
