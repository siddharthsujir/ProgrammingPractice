package com.company;

public class GK_BinaryTree {

    boolean isIdentical(Node1 root1, Node1 root2)
    {
        if(root1==null && root2==null)
            return true;
        // Code Here

        if((root1.left==null && root1.left!=null) || (root1.left!=null && root1.left==null)  )
            return false;
        if((root1.right==null && root1.right!=null)||(root1.right!=null && root1.right==null))
            return false;

        if(root1.left==null&&root1.right==null && root2.left==null&&root2.right==null)
        {
            if(root1.data!=root2.data)
                return false;
        }
        while(root1!=null && root2!=null)
        {
            return isIdentical(root1.left,root2.left)&&isIdentical(root1.right,root2.right);
        }

        if(root1!=null || root2!=null)
            return false;

        return true;
    }

    public static void main(String[] args)
    {

    }

    class Node1{
        int data;
        Node1 left,right;
        Node1(int d){
            data=d;
            left=right=null;
        }
    }
}
