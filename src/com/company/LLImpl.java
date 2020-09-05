package com.company;

public class LLImpl {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode sl=new SinglyLinkedListNode();
        sl.data=data;

        sl.next=llist;
        return  sl;

    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode temp=head;

        if(head==null)
            return new SinglyLinkedListNode(data);

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=new SinglyLinkedListNode(data);

        return head;

    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode temp=head;
        int count=0;

        while (count<position-1 && temp!=null)
        {
            temp=temp.next;
            count++;
        }

        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
        SinglyLinkedListNode swapnode=temp.next;
        temp.next=newNode;
        newNode.next=swapnode;

        return head;

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