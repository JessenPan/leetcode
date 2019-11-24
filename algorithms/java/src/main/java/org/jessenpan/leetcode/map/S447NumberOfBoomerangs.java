package org.jessenpan.leetcode.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S447NumberOfBoomerangs {

    public int numberOfBoomerangs(int[][] points) {
        int len = points.length;
        if (len < 3) {
            return 0;
        }
        int num=0;
        for (int i = 0; i < len; i++) {
            Map<Integer, Integer> distanceRecord = new HashMap<>();
            for (int j = 0; j < len; j++) {
                if (i != j) {
                    int distance = (points[j][0] - points[i][0]) * (points[j][0] - points[i][0]) + (points[j][1] - points[i][1]) * (points[j][1] - points[i][1]);
                    Integer cnt = distanceRecord.get(distance);
                    cnt=cnt==null?1:++cnt;
                    distanceRecord.put(distance, cnt);
                }
            }
            for (Integer sCnt : distanceRecord.values()) {
                if(sCnt>=2){
                    num += sCnt * (sCnt - 1);
                }
            }
        }
        return num;
    }
}
