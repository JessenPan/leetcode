package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:string
 */
public class S937ReorderLogFiles {

    public String[] reorderLogFiles(String[] logs) {
        List<String> numLogs = new ArrayList<>();
        List<LogPair> charLogs = new ArrayList<>();
        for (String log : logs) {
            String[] splitLog = log.split(" ");
            if (isNum(splitLog[1])) {
                numLogs.add(log);
            } else {
                charLogs.add(new LogPair(log, splitLog));
            }
        }
        charLogs.sort((other, another) -> {
            if (other.log.equals(another.log)) {
                return 0;
            }
            int otherLen = other.splitLog.length;
            int anotherLen = another.splitLog.length;
            int len = Math.min(otherLen, anotherLen);
            for (int i = 1; i < len; i++) {
                int compared = other.splitLog[i].compareTo(another.splitLog[i]);
                if (compared > 0) {
                    return 1;
                } else if (compared < 0) {
                    return -1;
                }
            }

            if (otherLen == anotherLen) {
                int compared = other.splitLog[0].compareTo(another.splitLog[0]);
                return Integer.compare(compared, 0);
            }
            return otherLen > anotherLen ? 1 : -1;
        });
        String[] reorderLogFiles = new String[logs.length];
        int index = 0;
        for (LogPair charLog : charLogs) {
            reorderLogFiles[index] = charLog.log;
            index++;
        }
        for (String numLog : numLogs) {
            reorderLogFiles[index] = numLog;
            index++;
        }
        return reorderLogFiles;
    }

    static class LogPair {

        private String log;
        private String[] splitLog;

        public LogPair(String log, String[] splitLog) {
            this.log = log;
            this.splitLog = splitLog;
        }
    }

    private boolean isNum(String str) {
        return '0' <= str.charAt(0) && str.charAt(0) <= '9';
    }

}
