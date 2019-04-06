package org.jessenpan.leetcode.bit;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:bit
 */
public class S405ConvertANumberToHexadecimal {

    private static final Map<Integer, Character> HEX_MAP = new HashMap<>();

    static {
        HEX_MAP.put(10, 'a');
        HEX_MAP.put(11, 'b');
        HEX_MAP.put(12, 'c');
        HEX_MAP.put(13, 'd');
        HEX_MAP.put(14, 'e');
        HEX_MAP.put(15, 'f');
    }

    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            int hexNum = num & 15;
            num = num >>> 4;
            if (hexNum <= 9) {
                sb.append(hexNum);
            } else {
                sb.append(HEX_MAP.get(hexNum));
            }
        }
        return sb.reverse().toString();
    }

}
