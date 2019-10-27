package org.jessenpan.leetcode.dynamicProgramming;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S638ShoppingOffers {

    //TODO 回溯算法

    List<Integer> price;

    List<List<Integer>> special;

    int min = 0;

    // 标记遍历到的礼包序号 
    int order = 0;

    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        this.price = price;
        this.special = special;
        // 最保守的策略
        int res = 0;
        for (int i = 0; i < price.size(); i++) {
            res += price.get(i) * needs.get(i);
        }
        this.min = res;
        dfs(0, needs);
        return min;
    }

    private void dfs(int res, List<Integer> needs) {
        if (isEmpty(needs)) {
            min = Math.min(res, min);
            return;
        }
        if (order == special.size()) {
            for (int i = 0; i < price.size(); i++) {
                res += price.get(i) * needs.get(i);
            }
            min = Math.min(res, min);
            return;
        }
        boolean flag = true;
        // 判断是否可以买该礼包
        for (int i = 0; i < needs.size(); ++i) {
            if (special.get(order).get(i) > needs.get(i)) {
                flag = false;
                break;
            }
        }
        int oldRes = res;
        List<Integer> oldNeeds = new ArrayList<>();
        if (flag) {
            oldNeeds.addAll(needs);
            res += special.get(order).get(needs.size());
            // 剪枝
            if (res < min) {
                for (int i = 0; i < needs.size(); ++i) {
                    needs.set(i, needs.get(i) - special.get(order).get(i));
                }
                dfs(res, needs);
            }
        }
        order++;
        if (flag) {
            dfs(oldRes, oldNeeds);
        } else {
            dfs(oldRes, needs);
        }
        order--;
    }

    private boolean isEmpty(List<Integer> needs) {
        for (Integer need : needs) {
            if (need != 0) {
                return false;
            }
        }
        return true;
    }

}
