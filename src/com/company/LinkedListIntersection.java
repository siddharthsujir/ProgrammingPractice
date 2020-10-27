package com.company;


   class ListNode2 {
      int val;
      ListNode next;
      ListNode2(int x) { val = x; }
  }

public class LinkedListIntersection {

    public void deleteNode(ListNode node) {

        ListNode temp=node.next;
        node.val=temp.val;
        node.next=temp.next;
        temp=null;
    }
}
