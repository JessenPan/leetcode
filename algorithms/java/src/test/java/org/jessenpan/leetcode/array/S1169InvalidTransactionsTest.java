package org.jessenpan.leetcode.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author jessenpan
 */
public class S1169InvalidTransactionsTest {

    private S1169InvalidTransactions invalidTransactions = new S1169InvalidTransactions();

    @Test
    public void test1() {
        List<String> list = invalidTransactions.invalidTransactions(new String[] { "alice,20,800,mtv", "alice,50,100,beijing" });
        Assert.assertEquals(Arrays.asList("alice,20,800,mtv", "alice,50,100,beijing"), list);
    }

    @Test
    public void test2() {
        List<String> list = invalidTransactions.invalidTransactions(new String[] { "alice,20,800,mtv", "alice,50,1200,mtv" });
        Assert.assertEquals(Collections.singletonList("alice,50,1200,mtv"), list);
    }

    @Test
    public void test3() {
        List<String> list = invalidTransactions.invalidTransactions(new String[] { "alice,20,800,mtv", "bob,50,1200,mtv" });
        Assert.assertEquals(Collections.singletonList("bob,50,1200,mtv"), list);
    }

}
