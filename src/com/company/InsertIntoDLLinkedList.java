package com.company;

import sun.print.DialogOwner;

public class InsertIntoDLLinkedList {

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {


        DoublyLinkedListNode temp = head;
        DoublyLinkedListNode node = new DoublyLinkedListNode(data);
// 1-- 2 -- 3 --4 -- 10

        if (temp.data > data) {
            node.next = temp;
            temp.prev = node;
            node.prev = null;
        } else
        {
            while(temp.next!=null && temp.next.data<data)
            {
                temp=temp.next;
            }

            node.next=temp.next;
            node.prev=temp;
            temp.next=node;

            return head;
        }

        return head;

    }
    // 1-- 2 -- 3 --4 -- 10
    // 1
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

        DoublyLinkedListNode temp= head;
        DoublyLinkedListNode newNode=null;

        while(temp.next!= null)
        {
           temp=temp.next;
        }
        newNode=new DoublyLinkedListNode(temp.data);
        while(temp.prev!=null)
        {
            newNode=temp;
            temp=temp.prev;
        }
        return head;
    }

}


     class DoublyLinkedListNode {
                int data;
                DoublyLinkedListNode next;
                  DoublyLinkedListNode prev;
                  DoublyLinkedListNode(int data)
                  {
                      this.data=data;
                  }
              }