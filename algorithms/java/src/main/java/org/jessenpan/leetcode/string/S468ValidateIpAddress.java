package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S468ValidateIpAddress {

    public String validIPAddress(String ip) {
        if (ip.startsWith(":") || ip.startsWith(".") || ip.endsWith(":") || ip.endsWith(".")) {
            return "Neither";
        }
        String[] beSplitted = ip.split("\\.");
        if (beSplitted.length == 4) {
            return isValidIPV4(beSplitted);
        } else {
            return isValidIPV6(ip);
        }
    }

    private String isValidIPV6(String ip) {
        String[] beSplitted;
        beSplitted = ip.split(":");
        if (beSplitted.length == 8) {
            long num;
            for (int i = 0; i < 8; i++) {
                if (beSplitted[i].length() > 4 || beSplitted[i].startsWith("-")) {
                    return "Neither";
                }
                try {
                    num = Long.parseLong(beSplitted[i], 16);
                } catch (NumberFormatException e) {
                    return "Neither";
                }
                if (num < 0) {
                    return "Neither";
                }
            }
            return "IPv6";
        }
        return "Neither";
    }

    private String isValidIPV4(String[] beSplitted) {
        int num;
        for (int i = 0; i < 4; i++) {
            try {
                num = Integer.parseInt(beSplitted[i]);
            } catch (NumberFormatException e) {
                return "Neither";
            }
            if (num < 0 || num > 255) {
                return "Neither";
            }
            if (beSplitted[i].length() > 1 && (beSplitted[i].startsWith("0") || beSplitted[i].startsWith("-"))) {
                return "Neither";
            }
        }
        return "IPv4";
    }

}
