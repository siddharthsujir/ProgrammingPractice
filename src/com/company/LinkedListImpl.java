package com.company;

public class LinkedListImpl {
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        Node head=null;

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

    public static Node insertAtBeginning(Node head,int value)
    {

        Node new_node =new Node(value);
        new_node.setNext(null);

        if(head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next=head;
        }
        return new_node;
    }

    public static Node removeFromHead(Node head)
    {
        if(head==null)
            return null;
        else
        {
            head=head.getNext();
        }

        return head;
    }

    public static Node addElementToLinkedList(Node head, int value)
    {
        Node new_node =new Node(value);
        new_node.setNext(null);

        if(head==null)
        {
            head=new_node;
        }
        else {
            Node temp = head;
            while (temp.next != null)
            {
                temp=temp.next;
            }
            temp.next=new_node;
        }

        return head;
    }

    public static Node removeElementFromLinkedList(Node head,int value)
    {
        Node temp=head;
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

    public static void printElementsOfLinkedList(Node n)
    {
        while(n!=null)
        {
            System.out.println(n.getElement()+ " ");
            n=n.getNext();
        }

    }
}




class Node
{
 int element;
 Node next;

 Node(int element)
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

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}