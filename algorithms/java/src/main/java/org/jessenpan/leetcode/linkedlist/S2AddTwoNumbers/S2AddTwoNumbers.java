package org.jessenpan.leetcode.linkedlist.S2AddTwoNumbers;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S2AddTwoNumbers {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) { val = x; }
    }

    public ListNode addTwoNumbers2(ListNode l1, ListNode l2) {

        ListNode reversedL1 = l1;
        ListNode reversedL2 = l2;

        ListNode dummy = new ListNode(-1);
        ListNode point = dummy;

        int carry = 0;

        int sum = 0;
        while (reversedL1 != null || reversedL2 != null || carry == 1) {
            sum = 0;
            if (reversedL1 != null) {
                sum += reversedL1.val;
                reversedL1 = reversedL1.next;
            }
            if (reversedL2 != null) {
                sum += reversedL2.val;
                reversedL2 = reversedL2.next;
            }
            sum += carry;
            if (sum >= 10) {
                carry = 1;
                sum -= 10;
            } else {
                carry = 0;
            }

            point.next = new ListNode(sum);
            point = point.next;
        }

        return dummy.next;
    }

   

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int lengthOfl1 = countTheLength(l1);
        int lengthOfl2 = countTheLength(l2);

        ListNode masterList, slaveList;
        if (lengthOfl1 >= lengthOfl2) {
            masterList = l1;
            slaveList = l2;
        } else {
            masterList = l2;
            slaveList = l1;
        }

        ListNode addResult = new ListNode(-1);
        ListNode iteratorOfAddResult = addResult;
        boolean hasCarryFlag = false;
        do {
            int singleResult = (masterList == null ? 0 : masterList.val) + (slaveList == null ? 0 : slaveList.val);
            if (hasCarryFlag) {
                singleResult += 1;
            }
            if (singleResult >= 10) {
                iteratorOfAddResult.next = new ListNode(singleResult - 10);
            } else {
                iteratorOfAddResult.next = new ListNode(singleResult);
            }

            iteratorOfAddResult = iteratorOfAddResult.next;
            hasCarryFlag = singleResult >= 10;
            if (masterList != null) {
                masterList = masterList.next;
            }
            if (slaveList != null) {
                slaveList = slaveList.next;
            }
        } while (masterList != null || hasCarryFlag);
        return addResult.next;
    }

    private int countTheLength(ListNode listNode) {
        ListNode iteratorOfList = listNode;
        if (iteratorOfList == null) {
            return 0;
        }
        int lengthOfListNode = 1;
        while (iteratorOfList.next != null) {
            lengthOfListNode++;
            iteratorOfList = iteratorOfList.next;
        }
        return lengthOfListNode;
    }
}
