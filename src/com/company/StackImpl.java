package com.company;


public class StackImpl {

    LinkedListImpl ll=new LinkedListImpl();

    public static void main(String[] args)
    {
        int[] array = {5,4,3,2,1};
        Stack2 s = new Stack2();

        for(int i:array)
        {
            s.push(i);
        }
        //s.printStack();

        System.out.println("Starting to pop");
        LLNode top=s.top;
        while (top!=null)
        {
            System.out.println(top.getElement());
            top=s.pop();

        }
    }



}


class Stack2
{
    LLNode top;
    Stack2()
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

    public LLNode pop()
    {
        top=LinkedListImpl.removeFromHead(top);
        return top;
    }
}