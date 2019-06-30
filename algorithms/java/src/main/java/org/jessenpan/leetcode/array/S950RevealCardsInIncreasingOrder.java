package org.jessenpan.leetcode.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author jessenpan
 * tag:array
 */
public class S950RevealCardsInIncreasingOrder {

    //TODO study
    public int[] deckRevealedIncreasing(int[] deck) {
        if (deck == null || deck.length < 1) {
            return deck;
        }

        Arrays.sort(deck);

        Queue<Integer> queue = new LinkedList<>();
        for (int i = deck.length - 1;i >= 0;i--) {
            queue.add(deck[i]);
            if (i == 0) {
                break;
            }

            queue.add(queue.poll());
        }

        for (int i = deck.length - 1;i >= 0;i--) {
            deck[i] = queue.poll();
        }

        return deck;
    }

}
