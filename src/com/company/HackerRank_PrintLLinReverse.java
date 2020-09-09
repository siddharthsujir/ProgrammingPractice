package com.company;

import java.util.Stack;

public class HackerRank_PrintLLinReverse {

    static void reversePrint(SinglyLinkedListNode head) {

        Stack<Integer> s= new Stack();
        while (head!=null)
        {
            s.push(head.data);
            head=head.next;
        }

        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }


    }

}
