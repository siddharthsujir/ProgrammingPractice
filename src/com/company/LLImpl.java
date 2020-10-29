package com.company;

public class LLImpl {
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode sl=new SinglyLinkedListNode(data);
        sl.data=data;

        sl.next=llist;
        return  sl;

    }

    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {

        SinglyLinkedListNode temp=head;

        if(head==null)
            return new SinglyLinkedListNode(data);

        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=new SinglyLinkedListNode(data);

        return head;

    }

    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        SinglyLinkedListNode temp=head;
        int count=0;

        while (count<position-1 && temp!=null)
        {
            temp=temp.next;
            count++;
        }

        SinglyLinkedListNode newNode=new SinglyLinkedListNode(data);
        SinglyLinkedListNode swapnode=temp.next;
        temp.next=newNode;
        newNode.next=swapnode;

        return head;

    }

    static SinglyLinkedListNode deleteNodeAtPosition(SinglyLinkedListNode head,int pos)
    {
        SinglyLinkedListNode temp=head;
        int count=0;

        if(pos==0)
        {
            head=head.next;
            return head;
        }


        while(count<pos-1 && temp!=null)
        {
            temp=temp.next;
            count++;
        }
        SinglyLinkedListNode tempN=temp.next.next;
        temp.next=null;
        temp.next=tempN;
        return head;
    }

    static SinglyLinkedListNode addTwoNumbers(SinglyLinkedListNode l1, SinglyLinkedListNode l2) {
        SinglyLinkedListNode output=null;
        int sum=0,carry=0;
        while(l1!=null && l2!=null)
        {
            sum=l1.data+l2.data+carry;
            if(sum/10!=0)
            {
                carry=sum/10;
                int val=sum%10;
                output=addToOutputList(output,val);
            }
            else
            {
                output=addToOutputList(output,sum);
                carry=0;
            }
            l1=l1.next;
            l2=l2.next;
        }

        while (l1!=null)
        {
            sum=l1.data+carry;
            if(sum/10!=0)
            {
                carry=sum/10;
                int val=sum%10;
                output=addToOutputList(output,val);
            }
            else
            {
                output=addToOutputList(output,sum);

                carry=0;
            }
            l1=l1.next;
        }

        while (l2!=null)
        {
            sum=l2.data+carry;
            if(sum/10!=0)
            {
                carry=sum/10;
                int val=sum%10;
                output=addToOutputList(output,val);
            }
            else
            {
                output=addToOutputList(output,sum);

                carry=0;
            }
            l2=l2.next;
        }

        if(carry!=0)
        {
            //output.next=new SinglyLinkedListNode(carry);
            output=addToOutputList(output,carry);
        }

        return output;
    }

    public static SinglyLinkedListNode addToOutputList(SinglyLinkedListNode output, int val)
    {
        if(output==null)
            output=new SinglyLinkedListNode(val);
        else
        {
            SinglyLinkedListNode temp=output;
            while (temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=new SinglyLinkedListNode(val);
        }
        return output;
    }

    public static void printLL(SinglyLinkedListNode node)
    {
        while (node!=null)
        {
            if(node.data==3)
                deleteNode(node);
            System.out.println(node.data);
            node=node.next;
        }
    }

    static void reversePrint(SinglyLinkedListNode head) {
        head=reverseAList(head);

        while (head!=null)
        {
            System.out.println(head.data);
            head=head.next;
        }
    }

    static void printLinkedList(SinglyLinkedListNode head) {

        while(head!=null)
        {

            System.out.println(head.data);
            head=head.next;
        }

    }

    static SinglyLinkedListNode reverseAList(SinglyLinkedListNode head)
    {
        SinglyLinkedListNode temp=head;
        SinglyLinkedListNode newList=null;

        while(temp!=null)
        {
            SinglyLinkedListNode t=temp.next;
            temp.next=null;

            if(newList==null)
                newList=temp;
            else
            {
                temp.next=newList;
            }
                newList=temp;

            temp=t;
        }
        return newList;
    }

    static boolean hasCycle(SinglyLinkedListNode head) {
        SinglyLinkedListNode slwPtr=head;
        SinglyLinkedListNode fastPtr=head.next;

        while(slwPtr!=null && fastPtr!=null)
        {
            if(slwPtr==fastPtr)
                return true;

            slwPtr=slwPtr.next;
            if(fastPtr.next!=null)
                fastPtr=fastPtr.next.next;
            else
                fastPtr=null;
        }
        return false;
    }

    public static void deleteNode(SinglyLinkedListNode node)
    {
        SinglyLinkedListNode temp=node.next;
        node.data=temp.data;
        node.next=temp.next;
        temp=null;

    }



    public static void main(String[] args)
    {
        int[] arr={1,2,3,4};
        int i=0;
        SinglyLinkedListNode node=null;
        while (i<arr.length)
        {
            node=addToOutputList(node,arr[i]);
            i++;
        }

        printLL(node);

       // reversePrint(node);
    }

    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        if(head1==null && head2==null)
            return true;
        if((head1==null && head2!=null) || (head2==null&& head1!=null))
            return false;


        while(head1!=null && head2!=null)
        {
            if(head1.data!=head2.data)
                return false;
            head1=head1.next;
            head2=head2.next;
        }

        if(head1!=null || head2!=null)
            return false;

    return  true;
    }

}


    class  SinglyLinkedListNode {
                 int data;
                 SinglyLinkedListNode next;

                 SinglyLinkedListNode(int data)
                 {
                     this.data=data;
                 }
}