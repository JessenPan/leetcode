package org.jessenpan.leetcode.minimax;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:minimax
 */
public class S464CanIWin {

    public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
        //第一种特殊情况，第一个人选一次即可到达预期值
        if (maxChoosableInteger >= desiredTotal) {
            return true;
        }
        //第二种特殊情况，所有元素的和都小于预期值，则永远无法赢
        if (maxChoosableInteger * (maxChoosableInteger + 1) / 2 < desiredTotal) {
            return false;
        }
        Map<Integer, Boolean> myMap = new HashMap<>();
        return canWin(maxChoosableInteger, desiredTotal, 0, myMap);
    }

    //由于maxChoosableInteger 不会大于 20，所以可以使用一个int型的各个位标记是否使用
    //myMap[used]用于标记在使用used（二进制各个位真值代表某个元素是否已经使用，比如used = “1101”代表使用了1，3，4）情况本次挑选是否能赢
    boolean canWin(int length, int nowTarget, int used, Map<Integer, Boolean> myMap) {
        if (myMap.containsKey(used)) {
            //如果之前搜索过
            return myMap.get(used);
        }
        //穷举当前可选的元素
        for (int i = 0; i < length; ++i) {
            int cur = (1 << i);//第i位表示选择[1,2,3, maxChoosableInteger]选择i + 1这个值
            if ((cur & used) == 0) {//这个值没有使用过
                //nowTarget <= i + 1是代表已经达到预期值
                //nowTarget - (i + 1)表示选择了i + 1
                //cur | used代表更新各个元素使用情况，使用i + 1，将used的第i位（从第到高）标记为1
                //!canWin(length, total - (i + 1), cur | used, myMap)表示的是对方选择输了
                if (nowTarget <= i + 1 || !canWin(length, nowTarget - (i + 1), cur | used, myMap)) {
                    myMap.put(used, true);
                    return true;
                }
            }
        }
        myMap.put(used, false);
        return false;
    }
}
