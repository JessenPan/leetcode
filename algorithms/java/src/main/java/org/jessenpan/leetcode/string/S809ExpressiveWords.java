package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:string
 */
public class S809ExpressiveWords {

    static class RecordedChar {

        char c;
        int times;

        RecordedChar() {}

        RecordedChar(char c, int times) {
            this.c = c;
            this.times = times;
        }
    }

    public int expressiveWords(String s, String[] words) {

        int sum = 0;
        boolean isMatch = true;
        List<RecordedChar> recordedChars = toRecordedChars(s);
        int len = recordedChars.size();
        for (String word : words) {
            List<RecordedChar> intsOfWord = toRecordedChars(word);
            isMatch = true;
            if (recordedChars.size() == intsOfWord.size()) {
                for (int i = 0; i < len; i++) {
                    RecordedChar c = recordedChars.get(i);
                    RecordedChar w = intsOfWord.get(i);
                    if (c.c != w.c) {
                        isMatch = false;
                        break;
                    }
                    if (c.times == w.times) {
                        continue;
                    }
                    if (c.times < 3 || c.times < w.times) {
                        isMatch = false;
                        break;
                    }

                }
                if (isMatch) {
                    sum++;
                }
            }
        }
        return sum;

    }

    private List<RecordedChar> toRecordedChars(String s) {
        int len = s.length();
        List<RecordedChar> chars = new ArrayList<>();
        char lastChar = 0;
        int times = 0;
        for (int i = 0; i < len; i++) {
            if (i == 0) {
                lastChar = s.charAt(i);
                times++;
                continue;
            }
            if (s.charAt(i) == lastChar) {
                times++;
            } else {
                chars.add(new RecordedChar(lastChar, times));
                times = 1;
                lastChar = s.charAt(i);
            }
            if (i == (len - 1)) {
                chars.add(new RecordedChar(lastChar, times));
            }
        }
        return chars;
    }

}
