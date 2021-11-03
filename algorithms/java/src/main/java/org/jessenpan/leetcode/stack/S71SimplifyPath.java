package org.jessenpan.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author jessenpan
 * tag:stack
 */
public class S71SimplifyPath {

    private static final String PATH_SEPARATOR = "/";

    private static final String CURRENT_PATH_SYMBOL = ".";

    private static final String UP_ONE_LEVEL_PATH_SYMBOL = "..";

    public String simplifyPath(String path) {

        String[] splitPathNodes = path.split(PATH_SEPARATOR);
        int lengthOfPathNodes = splitPathNodes.length;
        Deque<String> pathNodeStack = new LinkedList<>();
        
        for (int i = 0; i < lengthOfPathNodes; i++) {
            if (splitPathNodes[i] == null || "".equals(splitPathNodes[i]) || CURRENT_PATH_SYMBOL.equals(splitPathNodes[i])) {
                continue;
            } else if (UP_ONE_LEVEL_PATH_SYMBOL.equals(splitPathNodes[i])) {
                if (!pathNodeStack.isEmpty()) {
                    pathNodeStack.pop();
                }
            } else {
                pathNodeStack.push(splitPathNodes[i]);
            }
        }
        if (pathNodeStack.isEmpty()) {
            return "/";
        }
        StringBuilder sb = new StringBuilder(path.length());
        while (!pathNodeStack.isEmpty()) {
            sb.append("/").append(pathNodeStack.pollLast());
        }
        return sb.toString();
    }

}
