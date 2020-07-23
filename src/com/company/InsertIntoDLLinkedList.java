package com.company;

public class InsertIntoDLLinkedList {

    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {


        DoublyLinkedListNode temp=head;


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
                DoublyLinkedListNode swapNode=temp;
                DoublyLinkedListNode newNode=new DoublyLinkedListNode(data);
                newNode.data=data;
                newNode.prev=temp.prev;
                newNode.next=swapNode;
                temp.prev=newNode;
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