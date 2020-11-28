package com.company;

import sun.awt.image.ImageWatched;

import java.util.*;

public class GK_LRUCache {

    static Deque<Integer> deque=null;
    static HashMap<Integer,Integer> hashMap=null;
    static int CACHE_SIZE=0;

    GK_LRUCache(int cap)
    {
        // Intialize the cache capacity with the given
        // cap

        deque=new LinkedList<>();
        hashMap=new HashMap<>();
        CACHE_SIZE=cap;
    }

    // This method works in O(1)
    public static int get(int key)
    {
        // your code here
        if(hashMap.containsKey(key))
        {
            deque.remove(key);
            deque.addFirst(key);
            return hashMap.get(key);
        }
        return -1;
    }

    // This method works in O(1)
    public static void set(int key, int value)
    {
        // your code here
        if(!hashMap.containsKey(key))
        {
            if(deque.size()==CACHE_SIZE)
            {
                int a=deque.removeLast();
                deque.addFirst(key);
                hashMap.remove(a);
                hashMap.put(key,value);

            }
            else
            {
                deque.push(key);
                hashMap.put(key,value);
                CACHE_SIZE++;
            }
        }
        else
        {
            deque.remove(key);

        }
        deque.push(key);
        hashMap.put(key,value);

    }

    public static void main(String[] args)
    {

    }
}
