package com.company;

public class LLImpl {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode sl=new SinglyLinkedListNode();
        sl.data=data;

        sl.next=llist;
        return  sl;

    }

}


    class  SinglyLinkedListNode {
                 int data;
                 SinglyLinkedListNode next;

                 SinglyLinkedListNode(int data)
                 {
                     this.data=data;
                 }
}