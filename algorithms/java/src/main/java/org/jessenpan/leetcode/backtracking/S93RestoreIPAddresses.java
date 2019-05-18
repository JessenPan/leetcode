package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S93RestoreIPAddresses {

    private List<String> ips = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {
        findValidIpAddress(s, 0, "", 0);
        return ips;
    }

    private void findValidIpAddress(String originStr, int index, String subIp, int position) {
        if (index == 4) {
            if (position == originStr.length()) {
                ips.add(subIp);
            }
            return;
        }
        index++;
        for (int i = 1; i <= 3; i++) {
            if (position + i > originStr.length()) {
                continue;
            }
            String segment = originStr.substring(position, position + i);
            if (isValidSegment(segment)) {
                String newSubIp = (index != 1) ? (subIp + "." + segment) : subIp + segment;
                findValidIpAddress(originStr, index, newSubIp, position + i);
            }
        }
    }

    private boolean isValidSegment(String segment) {
        Integer num = Integer.parseInt(segment);
        if (num == 0) {
            return segment.length() == 1;
        }
        int compared = (int) Math.pow(10, segment.length() - 1);
        if (num < compared) {
            return false;
        }
        return num >= 0 && num <= 255;
    }

}
