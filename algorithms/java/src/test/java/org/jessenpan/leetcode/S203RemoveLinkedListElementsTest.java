package org.jessenpan.leetcode;

import org.junit.Test;

import static org.jessenpan.leetcode.S203RemoveLinkedListElements.*;

/**
 * @author jessenpan
 */
public class S203RemoveLinkedListElementsTest {

    private S203RemoveLinkedListElements removeLinkedListElements = new S203RemoveLinkedListElements();
    
    @Test
    public void test1(){
        ListNode node1=new ListNode(1);
        node1.next = new ListNode(2, new ListNode(6));
        removeLinkedListElements.removeElements(node1, 6);
    }

}
