package org.jessenpan.leetcode.divideAndConquer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:divideAndConquer
 */
public class S932BeautifulArray {

    //TODO 
    public int[] beautifulArray(int n) {
        return beautifulList(n).stream().mapToInt(t -> t).toArray();
    }

    private List<Integer> beautifulList(int n) {
        List<Integer> ans = new ArrayList<>();
        if (n == 1) {
            ans.add(1);
            return ans;
        } else {
            List<Integer> ve = beautifulList((n + 1) / 2);
            int sz = ve.size();
            for (int it = 0; it < sz; it++) {
                ans.add(2 * ve.get(it) - 1);
            }
            List<Integer> vv = beautifulList(n / 2);
            sz = vv.size();
            for (int it = 0; it < sz; it++) {
                ans.add(2 * vv.get(it));
            }
        }
        return ans;
    }

}
