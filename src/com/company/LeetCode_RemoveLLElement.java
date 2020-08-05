package com.company;

public class LeetCode_RemoveLLElement {

    public ListNode removeElements(ListNode head, int val) {

        if(head==null)
            return null;

        if(head.val==val)
        {
            while (head.val==val)
            {
                System.out.println("here");
                head=head.next;

                if(head==null)
                    return null;
            }

        }

        ListNode temp=head;


        // if List has only one element
        if(temp.next==null)
        {
            if(temp.val==val)
                return null;
            else
                return temp;
        }

        System.out.println(temp.val+"head");
        while(temp!=null&& temp.next!=null)
        {
            System.out.println(temp.val+"head");
            if(temp.next.val==val)
                temp.next=temp.next.next;
            else
                temp=temp.next;
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
