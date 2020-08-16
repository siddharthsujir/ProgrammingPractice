package com.company;

import java.awt.*;

public class Leetcode_DeleteNode {

    public void deleteNode(ListNode node) {

        ListNode temp=node;
        if(node.next==null)
            return;
        if(node.next!=null)
        {
            node=temp.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int i=0;
        ListNode temp=head;
        while(i!=n-1)
        {
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;

        return head;
    }
}
