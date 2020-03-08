package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:string
 */
public class S524LongestWordInDictionaryThroughDeleting {

    public String findLongestWord(String s, List<String> d) {

        int[] map = toMap(s);
        int len = s.length();

        List<String> ans = new ArrayList<>();
        for (String sOfD : d) {

            if (sOfD.length() > len) {
                continue;
            }
            int[] mapOfsub = toMap(sOfD);
            if (!contain(map, mapOfsub)) {
                continue;
            }
            if (isSubString(s, sOfD)) {
                ans.add(sOfD);
            }
        }
        if (ans.size() == 0) {
            return "";
        }
        ans.sort((o1, o2) -> {
            if (o1.length() != o2.length()) {
                return Integer.compare(o2.length(), o1.length());
            }
            return o1.compareTo(o2);
        });
        return ans.get(0);
    }

    private boolean isSubString(String parent, String son) {
        int idxOfParent = 0, idxOfSon = 0, lenOfSon = son.length(), lenOfParent = parent.length();
        while (idxOfParent < lenOfParent && idxOfSon < lenOfSon) {
            if (parent.charAt(idxOfParent) == son.charAt(idxOfSon)) {
                idxOfParent++;
                idxOfSon++;
            } else {
                idxOfParent++;
            }
        }
        return idxOfSon == lenOfSon;
    }

    private boolean contain(int[] parent, int[] mapOfsub) {
        for (int i = 0; i < 26; i++) {
            if (parent[i] < mapOfsub[i]) {
                return false;
            }
        }
        return true;
    }

    int[] toMap(String str) {
        int[] map = new int[26];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            map[str.charAt(i) - 'a']++;
        }
        return map;
    }

}
