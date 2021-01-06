package com.company;

import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

class DNode
{
    int data;
    DNode next;
    DNode prev;

    DNode(int val)
    {
        data=val;
    }
}

public class LRUImplementation {


    public HashMap<Integer,DNode> hashmap;
    public DNode head,tail;
    private final int CACHE_SIZE;
    int count=0;

    LRUImplementation(int CACHE_SIZE)
    {
        head=new DNode(0);
        tail=new DNode(0);
        this.CACHE_SIZE=CACHE_SIZE;
        head.next=tail;
        head.prev=null;
        tail.next=null;
        tail.prev=head;
        count=0;
    }


    public void deleteNode(DNode node)
    {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void addToHead(DNode node)
    {
        node.next=head.next;
        node.next.prev=node;
        node.prev=head;
        head.next=node;
    }

    public void get(int val)
    {
        if(hashmap.containsKey(val))
        {
            DNode node=hashmap.get(val);

            deleteNode(node);
            addToHead(node);

            System.out.println("Found "+val+" in the cache ");

        }
        else
        {
//            DNode node=new DNode(val);
//            addToHead(node);
//            hashmap.put(val,node);

            System.out.println("Not Found ");

        }


    }

    public void set(int val)
    {
        if(hashmap.containsKey(val))
        {
            DNode node=hashmap.get(val);

            deleteNode(node);
            addToHead(node);

        }
        else
        {
            DNode node=new DNode(val);
            hashmap.put(val,node);
            if(count<CACHE_SIZE)
            {
                count++;
                addToHead(node);
            }
            else
            {
                hashmap.remove(tail.prev.data);
                deleteNode(tail.prev);
                addToHead(node);

            }
        }
    }

}
