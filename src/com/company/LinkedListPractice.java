package com.company;

class Head
{
    int length=0;
    Head next;
    int value;

    Head(int value)
    {
        this.value=value;
        length++;
        this.next=null;
    }
}

public class LinkedListPractice {

    public static void main(String[] args)
    {

        int[] listElements={1,2,3,4,4};
        Head head=null;
        int i=0;
        //Insert Elements to Linked List

        while(i<listElements.length)
        {
            head=LinkedListPractice.insert(listElements[i],head);
            i++;
        }

        //print elements from the list

        printListElements(head);

        //remove repeating elements from the list
        head=removeRepeatingElements(head);

        //print elements from the list

        printListElements(head);

    }

    public static Head insert(int value,Head head)
    {
        if(head==null)
            return new Head(value);
        else if(head.next==null)
        {
            head.next=new Head(value);
        }
        else
        {
            Head temp=head;
            while(temp.next!=null)
                temp=temp.next;
            temp.next=new Head(value);
        }
        return head;
    }

    public static void printListElements(Head head)
    {
        while (head!=null)
        {
            System.out.print(head.value+"---->");
            head=head.next;
        }
        System.out.print("null");
    }

    public static Head removeRepeatingElements(Head head)
    {
        Head temp=head;
        while (temp!=null && temp.next!=null)
        {

            if( temp.next.value==temp.value)
            {
                temp.next=temp.next.next;
            }
           temp=temp.next;

        }
        return head;
    }



}
