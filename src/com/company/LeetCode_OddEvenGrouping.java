package com.company;



public class LeetCode_OddEvenGrouping {

    public ListNode oddEvenList(ListNode head) {

        ListNode temp= head;
        ListNode even=null;

        while(temp.next.next!=null)
        {
            even=insertEvenNode(even,temp.next);
            temp.next=head.next.next;
            temp= head.next;
        }
        temp.next=even;
        return head;

    }

    public static ListNode insertEvenNode(ListNode head, ListNode node)
    {
        ListNode temp1=head;
        if(temp1==null)
        {
            node.next=null;
            temp1=node;
        }
        else
        {
            while(temp1.next!=null)
            {
                temp1=temp1.next;
            }
            node.next=null;
            temp1.next=node;
        }
        return head;
    }

    public static void main(String[] args)
    {

    }
}



   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
