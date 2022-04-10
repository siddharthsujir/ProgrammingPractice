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


    // 1-->2-->3-->4-->5 k ==2
    // 4-->5-->1-->2-->3
    public Node rotateList(Node head, int k)
    {
        int i = 1;
        int j = 1;
        Node temp1 = head;
        Node temp2 = head;
        while(temp1!= null && i<k)
        {
            i++;
            temp1 = temp1.next;
        }

        Node kthNode  = temp1;

        while (temp1.next!=null)
            temp1 = temp1.next;

        temp1.next = head;
        head = kthNode.next;
        kthNode.next = null;

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
        //head = ll.reverseList(head);
        System.out.println("After Rotate");
        head = ll.rotateList(head, 2);

        ll.printLL(head);

    }

}