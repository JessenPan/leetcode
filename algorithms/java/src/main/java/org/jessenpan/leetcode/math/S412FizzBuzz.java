package org.jessenpan.leetcode.math;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:math
 */
public class S412FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        int mod3, mod5;
        for (int i = 1; i <= n; i++) {
            mod3 = i % 3;
            mod5 = i % 5;
            if (mod3 == 0 && mod5 == 0) {
                list.add("FizzBuzz");
                continue;
            }
            if (mod3 == 0) {
                list.add("Fizz");
                continue;
            }
            if (mod5 == 0) {
                list.add("Buzz");
                continue;
            }
            list.add(i + "");
        }
        return list;
    }

}
