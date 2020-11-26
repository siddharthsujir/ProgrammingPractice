package com.company;

public class GK_SortLinkedList {

    public static LL sortedMerge(LL left,LL right)
    {
        LL result=null;
        if(left==null)
            return right;
        if (right==null)
            return left;

            if(left.data<=right.data)
            {
                result=left;
                result.next=sortedMerge(left.next,right);
            }
            else if(right.data<left.data)
            {
                result=right;
                result.next=sortedMerge(left,right.next);
            }


        return result;
    }

    public static LL mergeSort(LL h)
    {
        //System.out.println(h.data);
        if(h==null || h.next==null)
            return h;

            LL middle=findMiddle(h);
            LL nextToMiddle=middle.next;
            middle.next=null;
            LL left=mergeSort(h);
            LL right=mergeSort(nextToMiddle);

            LL sortedMerge=sortedMerge(left,right);


        return sortedMerge;
    }

    public static LL findMiddle(LL head)
    {
        if(head==null)
            return head;

        LL fastPtr=head;
        LL slwPtr=head;

        while (fastPtr.next!=null &&fastPtr.next.next!=null)
        {
                fastPtr=fastPtr.next.next;


            slwPtr=slwPtr.next;
        }
        return slwPtr;
    }

    public static void main(String[] args)
    {
        LL node=new LL(2);
        //node.next=new LL(3);
        //node.next.next=new LL(1);

        node=mergeSort(node);

        while (node!=null)
        {
            System.out.println(node.data);
            node=node.next;
        }
    }
}
