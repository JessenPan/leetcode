package org.jessenpan.leetcode.dsu;

/**
 * @author jessenpan
 * tag:dsu
 */
public class S990SatisfiabilityOfEqualityEquations {

    static class DSU {

        int[] parent = new int[26];

        DSU() {
            for (int i = 0; i < 26; i++) {
                parent[i] = i;
            }
        }

        int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]);
            }
            return parent[x];
        }

        void union(int x, int y) {
            int fx = find(x), fy = find(y);
            parent[fx] = fy;
        }
    }

    public boolean equationsPossible(String[] equations) {
        int n = equations.length, x, y;
        String s;
        DSU dsu = new DSU();
        for (String equation : equations) {
            s = equation;
            if (s.charAt(1) == '=') {
                x = s.charAt(0) - 'a';
                y = s.charAt(3) - 'a';
                dsu.union(x, y);
            }
        }
        for (String equation : equations) {
            s = equation;
            if (s.charAt(1) == '!') {
                x = s.charAt(0) - 'a';
                y = s.charAt(0) - 'a';
                if (dsu.find(x) == dsu.find(y)) {
                    return false;
                }
            }
        }
        return true;
    }

}
