package com.company;

import java.awt.image.ImageProducer;
import java.util.HashMap;

public class LeetCode_LRUCache {


    public static void main(String[] args)
    {

    }
}

class  Node2
{
    int key;
    int value;
    Node2 prev;
    Node2 next;

    Node2(int key,int value)
    {
        this.key=key;
        this.value=value;
    }

}

class LRUCache {

    int capacity,count;
    HashMap<Integer,Node2> hm=null;
    Node2 head;
    Node2 tail;

    public LRUCache(int capacity) {

        this.capacity=capacity;
        hm= new HashMap<>();
        head=new Node2(0,0);
        tail=new Node2(0,0);
        head.next=tail;
        head.prev=tail;
        tail.prev=head;
        tail.next=head;
        count=0;

    }

    public void deleteNode(Node2 node)
    {
        node.prev.next=node.next;
        node.next.prev=node.prev;
    }

    public void addNodeToHead(Node2 node)
    {
        node.next=head.next;
        node.prev=head;
        node.next.prev=node;
        head.next=node;
    }

    public int get(int key) {
        if(hm.get(key)!=null)
        {
            Node2 temp=hm.get(key);
            deleteNode(temp);
            addNodeToHead(temp);
            int returnO=temp.value;

            return returnO;
        }

        return -1;
    }


    public void put(int key, int value) {
        if(hm.containsKey(key))
        {
            Node2 temp=hm.get(key);
            temp.value=value;
            deleteNode(temp);
            addNodeToHead(temp);
        }
        else
        {
            Node2 n=new Node2(key,value);
            hm.put(key,n);

            if(count<capacity)
            {
                count++;
                addNodeToHead(n);
            }
            else
            {
                hm.remove(tail.prev.key);
                deleteNode(tail.prev);
                addNodeToHead(n);
            }

        }
    }
}

