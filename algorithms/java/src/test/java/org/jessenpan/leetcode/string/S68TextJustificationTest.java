package org.jessenpan.leetcode.string;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author jessenpan
 */
public class S68TextJustificationTest {

    private S68TextJustification textJustification = new S68TextJustification();

    @Test
    public void test1() {
        List<String> list = textJustification.fullJustify(new String[] { "This", "is", "an", "example", "of", "text", "justification." }, 16);
        Assert.assertEquals(asList("This    is    an", "example  of text", "justification.  "), list);
    }

}
