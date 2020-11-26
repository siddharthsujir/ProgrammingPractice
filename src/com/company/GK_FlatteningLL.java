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

    public static void main(String[] args)
    {
        LL node=new LL(1);
        node.bottom=new LL(2);
        node.bottom.bottom=new LL(4);
        node.next=new LL(3);

        node=flatten(node);

        while (node!=null)
        {
            System.out.print(node.data+" ");
            node=node.next;
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