package com.company;

public class LeetCode_PalindromeList {

    public static boolean isPalindrome(ListNode head) {

        if(head==null || head.next==null)
            return true;

        ListNode reverseNode = reverseList(head);
        ListNode print =reverseNode;

        while (head != null)
        {
           // System.out.println(reverseNode.val);
            if(head.val!=reverseNode.val)
                return  false;

            head=head.next;
            reverseNode=reverseNode.next;
        }

    return  true;
    }

    public static  ListNode reverseList(ListNode node)
    {
        ListNode next=null;
        ListNode prev=null;
        ListNode current=node;

        while(current!=null)
        {
System.out.println("here");
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        node=prev;

        return node;
    }
    public static void main(String[] args)
    {

        ListNode node=new ListNode(1);
        node.next=new ListNode(1);
        node.next.next=new ListNode(2);
        node.next.next.next=new ListNode(1);
        System.out.println(isPalindrome(node));
    }
}
