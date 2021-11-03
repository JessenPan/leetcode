package org.jessenpan.leetcode.greedy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S649Dota2Senate {

    //TODO
    public String predictPartyVictory(String senate) {
        Queue<Integer> queue = new LinkedList<>();
        int[] people = new int[] { 0, 0 };
        int[] bans = new int[] { 0, 0 };

        for (char person : senate.toCharArray()) {
            int x = person == 'R' ? 1 : 0;
            people[x]++;
            queue.add(x);
        }

        while (people[0] > 0 && people[1] > 0) {
            Integer x = queue.poll();
            if (bans[x] > 0) {
                bans[x]--;
                people[x]--;
            } else {
                bans[x ^ 1]++;
                queue.add(x);
            }
        }

        return people[1] > 0 ? "Radiant" : "Dire";
    }

}
