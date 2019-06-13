package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:string
 */
public class S609FindDuplicateFileInSystem {

    public List<List<String>> findDuplicate(String[] paths) {

        Map<String, List<String>> contentPathMap = new HashMap<>();
        for (String path : paths) {
            String[] array = path.split(" ");
            String dir = array[0];
            int len = array.length;
            for (int i = 1; i < len; i++) {
                String fileAndContent = array[i];
                int idxOfLeftBracket = fileAndContent.indexOf('(');
                String fileName = fileAndContent.substring(0, idxOfLeftBracket);
                String content = fileAndContent.substring(idxOfLeftBracket + 1, fileAndContent.length() - 1);
                contentPathMap.putIfAbsent(content, new ArrayList<>());
                contentPathMap.get(content).add(dir + "/" + fileName);
            }
        }

        List<List<String>> files = new ArrayList<>();
        for (List<String> sameFiles : contentPathMap.values()) {
            if (sameFiles != null && sameFiles.size() > 1) {
                files.add(sameFiles);
            }
        }
        return files;
    }

}
