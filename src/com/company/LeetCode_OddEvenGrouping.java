package com.company;


import java.util.List;

public class LeetCode_OddEvenGrouping {

    public ListNode oddEvenList2(ListNode head) {

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

    public static ListNode oddEvenList(ListNode head)
    {
        if(head==null)
            return null;

        ListNode firstPtr=head;
        ListNode secondPtr=head;
        int length=1;
        int i=1;
        while (secondPtr.next!=null)
        {
            length++;
            secondPtr=secondPtr.next;
        }

        if(length==1 || length==2)
            return head;
        while (i<length)
        {
            ListNode temp=firstPtr.next;
            firstPtr.next=temp.next;
            temp.next=null;

            secondPtr.next=temp;
            secondPtr=secondPtr.next;
            i+=2;
            firstPtr=firstPtr.next;
        }
        return  head;
    }

    public static ListNode addToOutputList(ListNode output, int val)
    {
        if(output==null)
            output=new ListNode(val);
        else
        {
            ListNode temp=output;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new ListNode(val);
        }
        return output;
    }

    public static void printLL(ListNode node)
    {
        while (node!=null)
        {
            System.out.println(node.val);
            node=node.next;
        }
    }
    public static void main(String[] args)
    {

        int[] arr={1,1};
        int i=0;
        ListNode node=null;
        while (i<arr.length)
        {
            node=addToOutputList(node,arr[i]);
            i++;
        }

        printLL(node);

        node=oddEvenList(node);
        System.out.println("After Odd Even Grouping!");

        printLL(node);

    }
}



   class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
