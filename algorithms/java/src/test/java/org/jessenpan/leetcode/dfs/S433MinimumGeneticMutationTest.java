package org.jessenpan.leetcode.dfs;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author jessenpan
 */
public class S433MinimumGeneticMutationTest {

    private S433MinimumGeneticMutation minimumGeneticMutation = new S433MinimumGeneticMutation();

    @Test
    public void test1() {
        int times = minimumGeneticMutation.minMutation("AACCGGTT", "AACCGGTA", new String[] { "AACCGGTA" });
        Assert.assertEquals(1, times);
    }

    @Test
    public void test2() {
        int times = minimumGeneticMutation.minMutation("AACCGGTT", "AAACGGTA", new String[] { "AACCGGTA", "AACCGCTA", "AAACGGTA" });
        Assert.assertEquals(2, times);
    }

    @Test
    public void test3() {
        int times = minimumGeneticMutation.minMutation("AAAAACCC", "AACCCCCC", new String[] { "AAAACCCC", "AAACCCCC", "AACCCCCC" });
        Assert.assertEquals(3, times);
    }
    

    @Test
    public void test4() {
        int times = minimumGeneticMutation.minMutation("AACCGGTT", "AAACGGTA", new String[] { "AACCGATT","AACCGATA","AAACGATA","AAACGGTA" });
        Assert.assertEquals(4, times);
    }

}
