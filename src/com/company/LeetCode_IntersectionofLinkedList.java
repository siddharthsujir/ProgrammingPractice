package com.company;

import java.util.HashMap;

public class LeetCode_IntersectionofLinkedList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        HashMap<ListNode,Integer> hm=new HashMap<>();
        while (headA!=null && headB!=null)
        {
            if(hm.containsKey(headA))
                return headA;
            else if(hm.containsKey(headB))
                return headB;
            else if(headA==headB)
                return headA;
            else {
                hm.put(headA,1);
                hm.put(headB,1);
                headA=headA.next;
                headB=headB.next;
            }
        }
        return null;
    }
}
