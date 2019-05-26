package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S212WordSearchII {

    private char[][] board;

    private Set<String> foundWords = new HashSet<>();

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
                        board[j][k] = '1';
                        exist(new Point(j, k), p.children[i]);
                        board[j][k] = (char) (i + 'a');
                    }
                }
            }
        }
        return new ArrayList<>(foundWords);
    }

    static class Point {

        int x, y;

        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private void exist(Point point, Node p) {

        if (p.isEnd) {
            foundWords.add(p.str);
        }

        for (int j = 0; j < 26; j++) {
            if (p.children[j] == null) {
                continue;
            }
            for (int i = 0; i < 4; i++) {
                Point newPoint = createNextPoint(i, point);
                if (withinRange(newPoint) && board[newPoint.x][newPoint.y] == (char) (j + 'a')) {
                    board[newPoint.x][newPoint.y] = '1';
                    exist(newPoint, p.children[j]);
                    board[newPoint.x][newPoint.y] = (char) (j + 'a');
                }
            }
        }

    }

    private boolean withinRange(Point point) {
        return point.x >= 0 && point.x < row && point.y >= 0 && point.y < col;
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
