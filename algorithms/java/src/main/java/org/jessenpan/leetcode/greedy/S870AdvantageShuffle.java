package org.jessenpan.leetcode.greedy;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:greedy
 */
public class S870AdvantageShuffle {

    public int[] advantageCount(int[] A, int[] B) {

        Element[] elements = new Element[B.length];
        int len=B.length;
        for (int i = 0; i < len; i++) {
            
            Element ele=new Element(B[i],i);
            elements[i]=ele;
        }
    }

    static class Element {

        int val;
        int pos;

        public Element(int val, int pos) {
            this.val = val;
            this.pos = pos;
        }
    }

}
