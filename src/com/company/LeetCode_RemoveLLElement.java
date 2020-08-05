package com.company;

public class LeetCode_RemoveLLElement {

    public ListNode removeElements(ListNode head, int val) {

        ListNode temp=head;

        // 2 3 1 6 3 1
        if(temp==null)
            return null;

        // if List has only one element
        if(temp.next==null)
        {
            if(temp.val==val)
                return null;
            else
                return temp;
        }
        if(temp.val==val)
        {
            while (temp.val==val)
                temp=temp.next;
        }
        while(temp.next!=null)
        {
            if(temp.next.val==val)
                temp.next=temp.next.next;
        }
        return head;
    }
}



//
//   class ListNode {
//      int val;
//     ListNode next;
//     ListNode() {}
//      ListNode(int val) { this.val = val; }
//     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  }
