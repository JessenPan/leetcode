package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S38CountAndSay {

    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String lastGenerate = null;
        StringBuilder generate;
        int lengthOfLast, count = 1;
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                lastGenerate = "1";
                continue;
            }
            lengthOfLast = lastGenerate.length();
            generate = new StringBuilder();
            for (int j = 0; j < lengthOfLast; j++) {
                if (j != (lengthOfLast - 1)) {
                    if (lastGenerate.charAt(j) == lastGenerate.charAt(j + 1)) {
                        count++;
                    } else {
                        generate.append(count).append(lastGenerate.charAt(j));
                        count = 1;
                    }
                } else {
                    generate.append(count).append(lastGenerate.charAt(j));
                    count = 1;
                }
            }
            lastGenerate = generate.toString();
        }
        return lastGenerate;
    }
}
