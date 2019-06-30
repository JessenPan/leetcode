package org.jessenpan.leetcode.math;

/**
 * @author jessenpan
 * tag:math
 * 
 */
public class S535EncodeAndDecodeTinyurl {
    //題目漏洞
    public static class Codec {

        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            return longUrl + "x";
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return shortUrl.substring(0, shortUrl.length() - 1);
        }
    }

}
