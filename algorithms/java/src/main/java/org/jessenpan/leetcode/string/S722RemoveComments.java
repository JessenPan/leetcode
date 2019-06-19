package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:string
 */
public class S722RemoveComments {

    public List<String> removeComments(String[] source) {
        StringBuilder total = new StringBuilder(String.join("\n", source));
        List<String> res = new ArrayList<>();
        int idxLine = -1, indexbb = -1, i = 0, length = total.length();

        while (i < length - 1) {
            char first = total.charAt(i);
            char second = total.charAt(i + 1);
            if (first == '/' && second == '/') {
                idxLine = i;
                //删除直到\n
                while (i < length && total.charAt(i) != '\n') {
                    i++;
                }
                total.delete(idxLine, i);
                length -= (i - idxLine);
                i = idxLine - 1;
            } else if (first == '/' && second == '*') {
                //找到下一个*/
                indexbb = i;
                i += 2;
                while (i < length - 1 && !(total.charAt(i) == '*' && total.charAt(i + 1) == '/')) {
                    i++;
                }
                total.delete(indexbb, i + 2);
                length -= (i + 2 - indexbb);
                i = indexbb - 1;
            }
            i++;
        }
        String[] resArray = total.toString().split("\n");
        for (String str : resArray) {
            if (!str.isEmpty()) {
                res.add(str);
            }
        }
        return res;
    }

}
