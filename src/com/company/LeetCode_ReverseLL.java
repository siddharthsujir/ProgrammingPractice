package com.company;

public class LeetCode_ReverseLL {

// 1 2 3 4 5
    // 5 4 3 2 1
    public ListNode reverseList(ListNode head) {

        ListNode next=null;
        ListNode current=head;
        ListNode prev=null;

        while (current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;

        return  head;
    }
}
