package com.company;

import java.util.HashMap;

public class CycleInLL {


    boolean hasCycle(Node head) {
        HashMap<Node, Integer> hm= new HashMap<>();
        while(head!= null)
        {
            if(hm.containsKey(head))
                return true;
            else
                hm.put(head,1);

            head=head.next;
        }
        return false;
    }
}

//class Node
//{
//    int data;
//    Node next;
//}
