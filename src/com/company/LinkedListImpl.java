package com.company;

public class LinkedListImpl {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        LLNode head=null;

        // add Each elements of array to LinkedList
        for(int element : a)
        {
          head=addElementToLinkedList(head,element);
        }

        // Print each element of Array
        printElementsOfLinkedList(head);

        // remove particular element from LinkedList

        head=removeElementFromLinkedList(head,5);
        printElementsOfLinkedList(head);
        head=null;
        //Test insert at beginning
        for(int element : a)
        {

            head=insertAtBeginning(head,element);
        }
        System.out.println("Insert At beginning test \n");
        printElementsOfLinkedList(head);

    }

    public static LLNode insertAtBeginning(LLNode head, int value)
    {

        LLNode new_LL_node =new LLNode(value);
        new_LL_node.setNext(null);

        if(head==null)
        {
            head= new_LL_node;
        }
        else
        {
            new_LL_node.next=head;
        }
        return new_LL_node;
    }

    public static LLNode removeFromHead(LLNode head)
    {
        if(head==null)
            return null;
        else
        {
            head=head.getNext();
        }

        return head;
    }

    public static LLNode addElementToLinkedList(LLNode head, int value)
    {
        LLNode new_LL_node =new LLNode(value);
        new_LL_node.setNext(null);

        if(head==null)
        {
            head= new_LL_node;
        }
        else {
            LLNode temp = head;
            while (temp.next != null)
            {
                temp=temp.next;
            }
            temp.next= new_LL_node;
        }

        return head;
    }

    public static LLNode removeElementFromLinkedList(LLNode head, int value)
    {
        LLNode temp=head;
        if(head.getElement()==value)
        {
            head=head.getNext();
            return head;
        }
        while (temp!=null && temp.next.getElement()!=value)
        {
            temp=temp.next;
        }
        if(temp!=null && temp.next.getElement()==value)
        {
            temp.next=temp.next.next;
        }
    return head;
    }

    public static void printElementsOfLinkedList(LLNode n)
    {
        while(n!=null)
        {
            System.out.println(n.getElement()+ " ");
            n=n.getNext();
        }

    }
}




class LLNode
{
 int element;
 LLNode next;

 LLNode(int element)
 {
     this.element=element;
     this.next=null;
 }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }
}