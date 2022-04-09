package com.company.programming_2022;


class Node{
    int value;
    Node next;
    Node(int value)
    {
        this.value = value;
        this.next = null;
    }
}

public class LinkedListImpl {

    public Node insert(Node head, int value)
    {
        Node temp = head;
        if(temp == null)
            return new Node(value);
        if(temp.next == null)
            temp.next = new Node(value);
        else
        {
            while (temp.next!=null)
                temp = temp.next;

            temp.next = new Node(value);

        }
        return head;
    }

    public void printLL(Node head)
    {
        while(head!= null)
        {
            System.out.println(head.value + " -- ");
            head = head.next;
        }

    }


    // 1 --> 2 --> 3 --> 4 -->5
    //
    public Node reverseList(Node head)
    {
        Node temp = head;
        Node prev = null;
        while(temp!=null)
        {
            Node current  = temp;
            Node next = temp.next;
            current.next = prev;
            prev = current;
            temp = next;
        }
        head = prev;
        return head;
    }

    public static  void main(String[] args)
    {
        Node head = null;
        LinkedListImpl ll = new LinkedListImpl();
        int[] arr= {1,2,3,4,5};
        for (int j : arr)
            head = ll.insert(head, j);

        System.out.println("Before Reverse!");
        ll.printLL(head);
        head = ll.reverseList(head);
        System.out.println("After Reverse");
        ll.printLL(head);

    }

}