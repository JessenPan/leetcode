package org.jessenpan.leetcode.linkedlist;

/**
 * @author jessenpan
 * tag:linkedlist
 */
public class S160IntersectionOfTwoLinkedLists {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int x, ListNode next) {
            val = x;
            this.next = next;
        }
    }

  

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        //分别计算两链表长度，并且得到各自的最后一个节点
        int lengthA = 1;
        ListNode tempA = headA;
        while(tempA.next != null){
            tempA = tempA.next;
            lengthA++;
        }
        int lengthB = 1;
        ListNode tempB = headB;
        while(tempB.next != null){
            tempB = tempB.next;
            lengthB++;
        }
        //判断两链表是否相交，如果不相交，则根本不需要输出ListNode
        if(tempA.val != tempB.val){
            return null;
        }

        ListNode tA = headA;
        ListNode tB = headB;
        if(lengthA > lengthB){
            int n = lengthA - lengthB;
            for(int i = 0;i < n;i++){
                tA = tA.next;
            }
        }else{
            int m = lengthB - lengthA;
            for(int j = 0;j < m;j++){
                tB = tB.next;
            }
        }
        while(tA != tB){
            tA = tA.next;
            tB = tB.next;
        }
        return tA;
    }
    
}
