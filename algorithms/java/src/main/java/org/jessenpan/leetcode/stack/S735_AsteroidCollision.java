package org.jessenpan.leetcode.stack;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author jessenpan
 */
public class S735_AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> deque = new LinkedList<>();
        for (int asteroid : asteroids) {
            if (deque.isEmpty() || !isTurnLeftPlanet(asteroid)) {
                deque.push(asteroid);
            } else {
                whenLeftPlanetCome(deque, asteroid);
            }
        }
        return convert2Array(deque);
    }

    private int[] convert2Array(Deque<Integer> deque) {
        if (deque == null || deque.isEmpty()) {
            return new int[0];
        }
        int[] results = new int[deque.size()];
        int lengthOfArray = results.length;
        for (int i = 0; i < lengthOfArray; i++) {
            results[i] = deque.pollLast();
        }
        return results;
    }

    private void whenLeftPlanetCome(Deque<Integer> deque, int asteroid) {
        if (deque.isEmpty()) {
            deque.push(asteroid);
            return;
        }
        int asteroidInDeque = deque.peek();
        if (isTurnLeftPlanet(asteroidInDeque)) {
            deque.push(asteroid);
        } else {
            if (asteroidInDeque == Math.abs(asteroid)) {
                deque.pop();
            } else if (asteroidInDeque < Math.abs(asteroid)) {
                deque.pop();
                whenLeftPlanetCome(deque, asteroid);
            }
        }
    }

    private boolean isTurnLeftPlanet(Integer integer) {
        if (integer == null) {
            throw new IllegalArgumentException("can not be null");
        }
        return integer < 0;
    }
}
