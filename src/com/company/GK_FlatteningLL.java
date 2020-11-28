package com.company;

public class GK_FlatteningLL {

    public static LL flatten(LL head)
    {
        LL temp=head;

        while(temp!=null)
        {
            LL tNext=temp.next;
            LL tTemp=temp;
            while(temp.bottom!=null)
            {

                LL tempBottom=temp.bottom.bottom;
                LL bNode=temp.bottom;
                bNode.bottom=null;
                tTemp.next=bNode;
                tTemp=tTemp.next;
                temp.bottom=tempBottom;
                tempBottom=null;
            }
            tTemp.next=tNext;
            temp=temp.next;
        }

        return head;
    }

    public static LL flatten2(LL node)
    {
        LL temp1=node;
        LL temp2=node;
        while (temp1.next!=null)
        {
            LL tNext=temp1.next;

            while (temp2.bottom!=null)
            {
                temp2=temp2.bottom;
            }
            temp2.bottom=tNext;
           // q tNext.next=null;
            temp1=temp1.next;
        }
        return  node;
    }

    public static void main(String[] args)
    {
        LL node=new LL(1);
        node.bottom=new LL(2);
        node.bottom.bottom=new LL(4);
        node.next=new LL(3);

        node=flatten2(node);

        while (node!=null)
        {
            System.out.print(node.data+" ");
            node=node.bottom;
        }

    }
}


class LL
{
    int data;
    LL next;
    LL bottom;

    LL(int data)
    {
        this.data=data;
        next=null;
        bottom=null;
    }
}