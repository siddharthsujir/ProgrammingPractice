package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class HackerRank_MaximumElement {

    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        Stack<Integer> s = new Stack<>();
        Node2 node=null;
        while(n>0)
        {
            String[] str=br.readLine().split(" ");
           // System.out.println(str[0]);
            if(str[0].equals("1"))
            {
                int val=Integer.parseInt(str[1]);
                s.push(val);
                if(node==null)
                {

                    node=new Node2(val,0);
                    node.prev=null;
                    node.next=null;
                    //System.out.println("Adding node");
                }
                else {
                    if(node.key<val)
                    {
                        System.out.println("Entered Here!"+ val);
                        Node2 newNode=new Node2(val,0);
                        newNode.prev=node.prev;
                        newNode.next=node;
                        node.prev=newNode;
                        node=newNode;
                    }
                    else{
                        Node2 temp=node;
                        Node2 newNode=new Node2(val,0);
                        while(temp.next!=null && temp.next.value>val)
                        {
                            temp=temp.next;
                        }

                        // temp.next=newNode;
                        newNode.next=temp.next;
                        newNode.prev=temp;
                        temp.next=newNode;
                    }


                }
            }
            if(str[0].equals("2"))
            {
                int val=s.pop();
                if(node.key==val)
                {
                    if(node.next==null)
                    {
                        node=null;
                    }
                    else
                    {
                        node.next.prev=node.prev;
                        node=node.next;
                    }

                }
                else
                {
                    Node2 temp=node;
                    while(temp!=null&&temp.key!=val)
                    {
                        temp=temp.next;
                    }
                    if(temp!=null)
                    {

                        temp.prev.next=temp.next;
                        if(temp.next!=null)
                            temp.next.prev=temp.prev;
                    }
                }


            }
            if(str[0].equals("3"))
            {
                if(node!=null)
                {
                    System.out.println(node.key);
                }
            }
            n--;
        }
    }
}
