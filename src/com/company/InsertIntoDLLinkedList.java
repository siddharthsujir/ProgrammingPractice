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