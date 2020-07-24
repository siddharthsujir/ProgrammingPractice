package com.company;

public class InsertIntoDLLinkedList {

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {


        DoublyLinkedListNode temp=head;

// 1-- 2 -- 3 --4 -- 10
        while(temp!=null)
        {
            if(temp.data<data) {
                if (temp.next == null) {
                    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
                    temp.next = newNode;
                    newNode.prev = temp;
                    break;
                }
                temp = temp.next;
            }
            else if(temp.data>data)
            {
               // DoublyLinkedListNode swapNode=temp; 4 -- 5 -- 10


                if (temp.prev == null) {
                    DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
                    newNode.next = temp;
                    break;
                }
                temp=temp.prev;

                DoublyLinkedListNode newNode=new DoublyLinkedListNode(data);
                newNode.next=temp.next;
                temp.next=newNode;
                newNode.prev = temp;

                break;
            }

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