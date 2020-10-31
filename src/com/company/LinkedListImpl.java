package com.company;

public class LinkedListImpl {
    public static void main(String[] args) {


    }


    public static LLNode removeFromHead(LLNode head) {
        if (head == null)
            return null;
        else {
            head = head.getNext();
        }

        return head;
    }


    public static LLNode removeElementFromLinkedList(LLNode head, int value) {
        LLNode temp = head;
        if (head.getElement() == value) {
            head = head.getNext();
            return head;
        }
        while (temp != null && temp.next.getElement() != value) {
            temp = temp.next;
        }
        if (temp != null && temp.next.getElement() == value) {
            temp.next = temp.next.next;
        }
        return head;
    }

    public static void printElementsOfLinkedList(LLNode n) {
        while (n != null) {
            System.out.println(n.getElement() + " ");
            n = n.getNext();
        }

    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode temp = head;
        int i = 1;
        if (m == n)
            return head;

        if (m == 1)
            temp = reverseList(temp, i, n);
        else {
            while (i < m - 1) {
                temp = head.next;
                i++;
            }
            temp.next = reverseList(temp.next, i, n);
        }


        return head;

    }


    public static ListNode reverseList(ListNode head, int i, int n) {
        ListNode temp = head;
        ListNode newNode = null;
        while (i <= n) {
            ListNode t = temp.next;
            temp.next = null;
            if (newNode == null)
                newNode = temp;
            else {
                temp.next = newNode;
                newNode = temp;
                temp = null;
            }
            temp = t;
            i++;
        }

        if (temp != null) {
            newNode.next = temp.next;
        }
        return newNode;
    }

}


class LLNode
{
 int element;
 LLNode next;

 LLNode(int element)
 {
     this.element=element;
     this.next=null;
 }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }
}