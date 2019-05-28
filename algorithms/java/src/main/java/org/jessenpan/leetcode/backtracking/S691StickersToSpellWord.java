package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S691StickersToSpellWord {

    public int minStickers(String[] stickers, String target) {
        int stickersSize = stickers.length;
        Map<String, Integer> strStickerCnt = new HashMap<>();//strStickerCnt[str]表示的字符串str需要的最少贴纸数量
        int[][] myStickers = new int[stickersSize][26];//各个贴纸中各个字母出现的次数
        //统计每一个sticker中各个字符出现的次数
        for (int i = 0; i < stickersSize; i++) {
            int len = stickers[i].length();
            for (int j = 0; j < len; j++) {
                myStickers[i][stickers[i].charAt(j) - 'a'] += 1;
            }
        }
        strStickerCnt.put("", 0);//初始化，空字符串不需要贴纸
        return dfs(strStickerCnt, myStickers, target);
    }

    //搜索拼凑target需要的最少贴纸数量
    int dfs(Map<String, Integer> strStickerCnt, int[][] myStickers, String target) {
        if (strStickerCnt.get(target) != null) {
            //如果target已经搜索过，直接返回
            return strStickerCnt.get(target);
        }
        int minRes = Integer.MAX_VALUE, stickersSize = myStickers.length;
        //统计target中各个字符出现的次数
        int[] tar = new int[26];
        for (int j = 0; j < target.length(); j++) {
            tar[target.charAt(j) - 'a']++;
        }
        //尝试使用每一个sticker
        for (int i = 0; i < stickersSize; ++i) {
            //如果当前sticker中没有target[0]这个字符则剪枝
            if (myStickers[i][target.charAt(0) - 'a'] == 0) {
                continue;
            }
            //使用当前sticker，nowTarget为运用贴纸后剩余的字母
            StringBuilder nowTarget = new StringBuilder();
            for (int j = 0; j < 26; j++) {
                if (tar[j] - myStickers[i][j] > 0) {
                    int num = tar[j] - myStickers[i][j];
                    for (int k = 0; k < num; k++) {
                        nowTarget.append((char) ('a' + j));
                    }
                }
            }
            //搜索nowTarget字符串需要最少贴纸数
            int tempRes = dfs(strStickerCnt, myStickers, nowTarget.toString());
            //更新target字符串需要的最少贴纸数
            if (tempRes != -1) {
                minRes = Math.min(minRes, 1 + tempRes);
            }
        }
        strStickerCnt.put(target, (minRes == Integer.MAX_VALUE ? -1 : minRes));//标记target已经搜索过
        return strStickerCnt.get(target);
    }

}
