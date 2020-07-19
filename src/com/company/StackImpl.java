package com.company;


public class StackImpl {

    LinkedListImpl ll=new LinkedListImpl();

    public static void main(String[] args)
    {
        int[] array = {5,4,3,2,1};
        Stack s = new Stack();

        for(int i:array)
        {
            s.push(i);
        }
        //s.printStack();

        System.out.println("Starting to pop");
        Node top=s.top;
        while (top!=null)
        {
            System.out.println(top.getElement());
            top=s.pop();

        }
    }



}


class Stack
{
    Node top;
    Stack()
    {
        top=null;
    }

    public void push(int value)
    {
            top= LinkedListImpl.insertAtBeginning(top,value);
            
    }

    public void printStack()
    {
        LinkedListImpl.printElementsOfLinkedList(top);
    }

    public  Node pop()
    {
        top=LinkedListImpl.removeFromHead(top);
        return top;
    }
}